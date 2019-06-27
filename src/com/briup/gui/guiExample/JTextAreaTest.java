package com.briup.gui.guiExample;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *@author: Lilx
 *@date: Feb 25, 2012
 *@company: cstd
 *@Email:llxhappy@126.com
 */
public class JTextAreaTest {
	public static void main( String args[]) {
		JFrame f = new JFrame("留言板");
		JTextArea message = new JTextArea(20,20);
		f.add(new JLabel("请您留言:"),"North");
		f.add(message,"Center");
				
		JPanel p = new JPanel();	
		p.setLayout(new GridLayout(1,6));
		
		String[] buttonLabels = {"剪切","复制","粘贴","删除","提交","清除"};
		String[] buttonActionCommands = {"CUT","COPY","PASTE","DELETE","SUBMIT","RESET"};
		JButton[] buttons = new JButton[6];		
		OuterMonitor om = new OuterMonitor(message,buttons);
		
		for(int i=0;i<buttons.length;i++){
			buttons[i] = new JButton(buttonLabels[i]);	
			buttons[i].setActionCommand(buttonActionCommands[i]);
			if(i<4){
				buttons[i].setEnabled(false);
			}
			buttons[i].addActionListener(om);
			p.add(buttons[i]);
		}		
		message.addMouseMotionListener(om);
		
		f.add(p,"North");
		f.setSize(400,150);
		f.setLocation(300,100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible( true);
	}
}
class OuterMonitor extends MouseMotionAdapter implements ActionListener{
	private JTextArea msgBoard;
	private JButton[] buttons;
	private String clipBoard = "";
	
	public OuterMonitor(JTextArea msgBoard,JButton[] buttons){
		this.msgBoard = msgBoard;
		this.buttons = buttons;	
	}	
	public void setClipBoard(String text){
		this.clipBoard = text;	
	}
	public String getClipBoard(){
		return this.clipBoard;	
	}
	
	public void actionPerformed(ActionEvent e){
		int positon = msgBoard.getSelectionStart();
		String s = e.getActionCommand();
		if(s.equals("RESET")){
			msgBoard.setText("");
		}else if(s.equals("SUBMIT") ){
			System.out.println("你的留言为：\n  " + msgBoard.getText());	
		}else if(s.equals("COPY")){
			clipBoard = msgBoard.getSelectedText();
			msgBoard.setSelectionStart(msgBoard.getSelectionEnd());
		}else if(s.equals("CUT")){
			clipBoard = msgBoard.getSelectedText();
			this.delete();
		}else if(s.equals("PASTE")){
			String content = msgBoard.getText();
			String alter = content.substring(0,positon) + clipBoard + content.substring(positon);
			msgBoard.setText(alter);
		}else if(s.equals("DELETE")){
			this.delete();	
		}	
		this.switchButtons();
	}	
	public void delete(){
			int start = msgBoard.getSelectionStart();
			int end = msgBoard.getSelectionEnd();
			String content = msgBoard.getText();
			String alter = content.substring(0,start) + content.substring(end);
			msgBoard.setText(alter); 	
	}
	public void switchButtons(){
		boolean clipped = (clipBoard!=null) && (clipBoard.length()>0);
		buttons[2].setEnabled(clipped);
		boolean selected = msgBoard.getSelectionEnd() != msgBoard.getSelectionStart();	
		buttons[0].setEnabled(selected);	
		buttons[1].setEnabled(selected);	
		buttons[3].setEnabled(selected);	
	}
	@Override
	public void mouseDragged(MouseEvent te){
		this.switchButtons();	
	}	
}