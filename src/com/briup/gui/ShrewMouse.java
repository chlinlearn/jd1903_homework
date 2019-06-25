package com.briup.gui;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/19/18:51
 * @description: 打地鼠游戏，GUI界面
 */

import javax.swing.*;
import java.awt.*;

public class ShrewMouse {
    private JFrame frame;
    private Container contentPanel;
    private JButton startBtn;
    private JLabel label1,label2,label3,label4;

    //创建桌子
    public ShrewMouse(){
        frame = new JFrame();
        frame.setTitle("打地鼠游戏");
        frame.setSize(500,600);
        frame.setBackground(Color.gray);
        contentPanel = frame.getContentPane();
        //设置容器的布局管理器
        contentPanel.setLayout(new FlowLayout());
        initGui();
    }

    //初始化
    public void initGui(){
        startBtn = new JButton("开始");
        label1 = new JLabel("1");
        label2 = new JLabel("2");
        label3 = new JLabel("3");
        label4 = new JLabel("4");
        label1.setSize(10,10);
        label2.setSize(100,100);
        label3.setSize(100,100);
        label4.setSize(100,100);
        contentPanel.add(startBtn);
        contentPanel.add(label1);
        contentPanel.add(label2);
        contentPanel.add(label3);
        contentPanel.add(label4);
    }

    //显示界面
    public void show(){
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ShrewMouse().show();
    }
}
