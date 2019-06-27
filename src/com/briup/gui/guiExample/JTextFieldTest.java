package com.briup.gui.guiExample;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *@author: Lilx
 *@date: Feb 25, 2012
 *@company: cstd
 *@Email:llxhappy@126.com
 */
public class JTextFieldTest implements ActionListener{
	JTextField name;
	JPasswordField password;
	
	public static void main( String args[]) {
		JTextFieldTest ttf = new JTextFieldTest();
		ttf.createUI();
	}
	
	public void createUI(){
		JFrame f = new JFrame("登录界面");
		f.add(new JLabel("请输入您的用户信息:"),"North");
		
		JPanel p1 = new JPanel();
		p1.setLayout(new BorderLayout());		
		JPanel p11 = new JPanel();
		p11.setLayout(new GridLayout(2,1));
		p11.add(new JLabel("用户名:"));
		p11.add(new JLabel("密  码:"));		
		JPanel p12 = new JPanel();
		p12.setLayout(new GridLayout(2,1));
		name = new JTextField(10);
		name.addActionListener(this);
		password = new JPasswordField(10);
		password.setEchoChar('*');
		password.addActionListener(this);
		p12.add(name);
		p12.add(password);		
		p1.add(p11,"West");
		p1.add(p12,"Center");
		
		JPanel p2 = new JPanel();		
		JButton submit = new JButton("提交");
		JButton reset = new JButton("重置");
		submit.addActionListener(this);
		reset.addActionListener(this);

		p2.add(submit);
		p2.add(reset);
		
		f.add(p1,"Center");
		f.add(p2,"South");
		f.setSize(200,130);
		f.setLocation(300,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible( true);
	}
	
	public void actionPerformed(ActionEvent e){
		String s = e.getActionCommand();
		if(s.equals("重置")){
			this.clear();
		}else if(s.equals("提交") || (e.getSource()==name) || (e.getSource()==password)){
			this.submit();	
		}			
	}	
	public void clear(){
		name.setText("");
		password.setText("");	
	}
	public void submit(){
		String n = name.getText();
		String psw = password.getText();
		System.out.println("用户名:" + n + "\t密码:" + psw);	
	}
}