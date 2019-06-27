package com.briup.gui.guiExample;

import java.awt.GridLayout;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *@author: Lilx
 *@date: Feb 25, 2012
 *@company: cstd
 *@Email:llxhappy@126.com
 */
public class JScrollPaneTest{
	public static void main( String args[]) {
		JFrame frame = new JFrame("表格效果");
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(10,5));
		JTextField[] cells = new JTextField[50];
		for(int i=0;i<50;i++){
			cells[i] = new JTextField(String.valueOf(i),5);
			p.add(cells[i]);	
		}
		
		ScrollPane sp = new ScrollPane();
		sp.add(p);
		frame.add(sp,"Center");
		frame.setSize(250,180);
		frame.setLocation(450,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible( true);		
	}
}

