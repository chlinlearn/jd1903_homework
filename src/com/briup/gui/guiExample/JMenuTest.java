package com.briup.gui.guiExample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;



/**
 *@author: Lilx
 *@date: Feb 25, 2012
 *@company: cstd
 *@Email:llxhappy@126.com
 */
public class JMenuTest{
	public static void main( String args[]) {
		JFrame f = new JFrame("记事本");
		JTextArea ta = new JTextArea("",20,20);
		f.add(ta,"Center");
		
		MyMonitor mm = new MyMonitor();
		
		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu("文件");
		JMenu m2 = new JMenu("编辑");
		JMenu m3 = new JMenu("格式");
		JMenu m4 = new JMenu("帮助");
		
		JMenuItem mi11 = new JMenuItem("新建");  
		JMenuItem mi12 = new JMenuItem("打开");  
		JMenuItem mi13 = new JMenuItem("保存");  
		JMenuItem mi14 = new JMenuItem("另存为");  
		JMenuItem mi15 = new JMenuItem("退出"); 
		mi15.addActionListener(mm);		 
		m1.add(mi11);
		m1.add(mi12);
		m1.add(mi13);
		m1.add(mi14);
		m1.addSeparator();
		m1.add(mi15);
		
		JCheckBoxMenuItem mi31 = new JCheckBoxMenuItem("二进制");
		JMenuItem mi32 = new JMenuItem("字体");
		mi31.addActionListener(mm);
		m3.add(mi31);
		m3.add(mi32);
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		f.setJMenuBar(mb);
		f.setSize(300,200);
		f.setLocation(300,100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible( true);
	}
}
class MyMonitor implements ActionListener{
	public void actionPerformed(ActionEvent e){
		String s = e.getActionCommand();
		System.out.println(s);
		if(s.equals("退出")){
			System.exit(0);	
		}	
	}
}