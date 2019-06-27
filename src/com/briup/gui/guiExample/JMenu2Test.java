package com.briup.gui.guiExample;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *@author: Lilx
 *@date: Feb 25, 2012
 *@company: cstd
 *@Email:llxhappy@126.com
 */
public class JMenu2Test{
	private JFrame f = new JFrame("测试窗口");
	private JLabel message = new JLabel();
	private JPopupMenu pm;	

	public static void main( String args[]) {
		new JMenu2Test().createUI();
	}
	
	public void createUI(){
		message.setOpaque(true);
		f.add(message,"Center");		
		MyMonitor mm = new MyMonitor();		
		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu("文件");
		JMenu m2 = new JMenu("格式");
		JMenu m3 = new JMenu("帮助");
			
		JMenuItem m21 = new JMenuItem("字体");
		JMenu m22 = new JMenu("背景");
		
		JMenuItem bg_red = new JMenuItem("red");  
		JMenuItem bg_blue = new JMenuItem("blue");  
		JMenuItem bg_green = new JMenuItem("green");  
		JMenuItem bg_customize = new JMenuItem("用户自定义");  

		bg_red.addActionListener(mm);
		bg_blue.addActionListener(mm);
		bg_green.addActionListener(mm);
		bg_customize.addActionListener(mm);
				 
		m22.add(bg_red);
		m22.add(bg_blue);
		m22.add(bg_green);	
		m22.addSeparator();	
		m22.add(bg_customize);
		
		m2.add(m21);
		m2.add(m22);
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		f.setJMenuBar(mb);
		
		pm = new JPopupMenu();	
		JMenuItem start = new JMenuItem("Start");
		JMenuItem stop = new JMenuItem("Stop");
		pm.add(start);
		pm.add(stop);
		start.addActionListener(mm);
		stop.addActionListener(mm);
		message.add(pm);

		message.addMouseListener(mm);
		
		f.setSize(200,150);
		f.setLocation(300,100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible( true);
	}
	
	public class MyMonitor extends MouseAdapter implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String s = e.getActionCommand();
			if(s.equals("red")){
				message.setBackground(Color.RED); 
			}else if(s.equals("blue")){
				message.setBackground(Color.BLUE); 
			}else if(s.equals("green")){
				message.setBackground(Color.GREEN); 
			}else if(s.equals("Start")){
				message.setText("生活多美好！"); 
			}else if(s.equals("Stop")){
				message.setText("Bye-bye,the world!"); 
			}	
		}
		@Override
		public void mousePressed(MouseEvent e){
			if(e.isPopupTrigger()){
				pm.show(message,e.getX(),e.getY());	
			}	
		}
		@Override
		public void mouseReleased(MouseEvent e){
			if(e.isPopupTrigger()){
				pm.show(message,e.getX(),e.getY());	
			}	
		}
	}
}