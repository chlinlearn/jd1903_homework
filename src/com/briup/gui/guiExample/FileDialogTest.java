package com.briup.gui.guiExample;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *@author: Lilx
 *@date: Feb 25, 2012
 *@company: cstd
 *@Email:llxhappy@126.com
 */
public class FileDialogTest implements ActionListener{
	private Frame frame;
	private FileDialog fd_load;
	private FileDialog fd_save;
	private TextArea ta;
	private String file = "";
	public static void main( String args[]) {
		new FileDialogTest().init();
	}
	
	public void init(){
		frame = new Frame("My Notepad");
		MenuBar mb = new MenuBar();
		Menu file = new Menu("文件");
		Menu help = new Menu("帮助");
		MenuItem open = new MenuItem("打开");
		MenuItem save = new MenuItem("保存");
		MenuItem saveAs = new MenuItem("另存为");		
		file.add(open);
		file.add(save);
		file.add(saveAs);
		mb.add(file);
		mb.add(help);		
		frame.setMenuBar(mb);
		ta = new TextArea();
		frame.add(ta,"Center");		
		open.addActionListener(this);
		save.addActionListener(this);
		saveAs.addActionListener(this);
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);	
			}	
		});  
		frame.setSize(400,200);
		frame.setLocation(450,200);
		frame.setVisible( true);		
		fd_load = new FileDialog(frame,"打开文件",FileDialog.LOAD);
		fd_save = new FileDialog(frame,"保存文件",FileDialog.SAVE);
	}

	public void actionPerformed(ActionEvent e){
		String s = e.getActionCommand();
		if(s.equals("打开")){
			fd_load.setVisible(true);
			String d = fd_load.getDirectory();
			String f = fd_load.getFile();
			if((d != null) && (f != null)){
				file = d + f;
				this.loadFile();	
			}
		}else if(s.equals("保存")){
			if((file==null) || file.equals("")){
				this.saveFileAs();
			}else{
				this.saveFile();
			}
		}else if(s.equals("另存为")){
			this.saveFileAs();
		}
	}	
	public void loadFile(){
		ta.setText("");
		frame.setTitle("My Notepad - " + file);
		try{
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s = br.readLine();
			while(s != null){
				ta.append(s + "\n");
				s = br.readLine();	
			}	
			br.close();
		}catch(IOException e){
			e.printStackTrace();	
		}
	}
	public void saveFile(){
		String content = ta.getText();
		try{
			PrintWriter pw = new PrintWriter(new FileWriter(file));
			pw.println(content);
			pw.close();	
		}catch(IOException e){
			e.printStackTrace();	
		}
	}
	public void saveFileAs(){
		fd_save.setVisible(true);	
		String d = fd_save.getDirectory();
		String f = fd_save.getFile();
		if((d != null) && (f != null)){
			file = d + f;
			this.saveFile();
			frame.setTitle("My Notepad - " + file);
		}		
	}
}
