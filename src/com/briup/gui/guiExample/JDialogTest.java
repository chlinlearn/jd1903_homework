package com.briup.gui.guiExample;

import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
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
public class JDialogTest implements ActionListener{
	private JLabel info;
	private JDialog loginDialog;
	private JDialog quitDialog;
	private JTextField tf_name;
	private JPasswordField tf_psw;
	public static void main( String args[]) {
		new JDialogTest().init();
	}
	
	public void init(){
		JFrame f = new JFrame("注册窗口");
		JButton login = new JButton("登录");
		JButton regist = new JButton("注册");
		JButton help = new JButton("帮助");
		JButton exit = new JButton("退出");
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,4));		
		p.add(login);
		p.add(regist);
		p.add(help);
		p.add(exit);
		info = new JLabel("您尚未登录");
		f.add(p,"North");		
		f.add(info,"Center");
		
		login.addActionListener(this);
		exit.addActionListener(this);
		
		f.setSize(400,150);
		f.setLocation(450,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible( true);
		loginDialog = this.createLoginDialog(f);
		quitDialog = this.createQuitDialog(f);
	}
	
	public JDialog createLoginDialog(JFrame f){
		JDialog d = new JDialog(f,"登录对话框",true);
		JLabel note = new JLabel("请输入注册信息");
		
		JPanel pa = new JPanel();
		pa.setLayout(new GridLayout(2,1));
		pa.add(new JLabel("用户名:"));		
		pa.add(new JLabel("密  码:"));	
		
		JPanel pc = new JPanel();	
		pc.setLayout(new GridLayout(2,1));
		tf_name = new JTextField();
		tf_psw = new JPasswordField(); 
		tf_psw.setEchoChar('*');
		pc.add(tf_name);		
		pc.add(tf_psw);		
		
		JPanel pb = new JPanel();
		pb.setLayout(new GridLayout(1,2));
		JButton submit = new JButton("提交");	
		JButton cancel = new JButton("取消");	
		submit.setActionCommand("submitLogin");
		cancel.setActionCommand("cancelLogin");
		submit.addActionListener(this);
		cancel.addActionListener(this);
		pb.add(submit);
		pb.add(cancel);
		
		d.add(note,"North");
		d.add(pa,"West");
		d.add(pc,"Center");
		d.add(pb,"South");
		d.setSize(160,120);
		d.setLocation(400,200);		
		return d;
	}
	
	public JDialog createQuitDialog(JFrame f){
		JDialog d = new JDialog(f,"确认退出对话框",true);
		JLabel note = new JLabel("您确定要退出程序吗？");
		JPanel p = new JPanel();
		//p.setLayout(new GridLayout(1,2));
		JButton confirm = new JButton("确定");	
		JButton cancel = new JButton("取消");	
		confirm.setActionCommand("confirmQuit");
		cancel.setActionCommand("cancelQuit");
		confirm.addActionListener(this);
		cancel.addActionListener(this);
		p.add(confirm);
		p.add(cancel);
		d.setSize(160,120);
		d.setLocation(400,200);
		d.add(note,"Center");
		d.add(p,"South");
		return d;
	}
	
	public void actionPerformed(ActionEvent e){
		String s = e.getActionCommand();
		if(s.equals("登录")){
			loginDialog.setVisible(true);
		}else if(s.equals("退出")){
			this.quit();	
		}else if(s.equals("confirmQuit")){
			System.exit(0);	
		}else if(s.equals("cancelQuit")){
			quitDialog.setVisible(false);	
		}else if(s.equals("submitLogin")){
			String name = tf_name.getText();
			String password = tf_psw.getText();
			if(name.equals("CoreJava") && password.equals("Tiger")){
				info.setText("欢迎您: " + name + " 用户");	
			}else{
				info.setText("验证失败，错误的用户名/密码!");	
			}
			loginDialog.setVisible(false);	
		}else if(s.equals("cancelLogin")){
			loginDialog.setVisible(false);	
		}
	}
	public void quit(){
		quitDialog.setVisible(true);	
	}
}