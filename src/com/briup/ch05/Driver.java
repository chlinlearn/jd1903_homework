package com.briup.ch05;

public class Driver {
	public static void main(String[] args) {
		//创建Track 对象，并设置title
		Track track = new Track();
		track.setTitle("标题1");

		//创建Duration对象：两种方式;
		//第一种利用构造器传入总的秒数；第二种利用构造器传入时、分、秒
		Duration duration = new Duration(59);
		Duration duration2 = new Duration(1, 1, 60);
		
		//把Duration对象依赖放进Track对象中
		track.setDuration(duration);
		
		//Title、Track、以及通过Track中的属性方法打印出Duration对象
        System.out.println(track.toString());
	}
}