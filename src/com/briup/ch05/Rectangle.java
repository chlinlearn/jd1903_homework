/**
 * @author xuchunlin
 * @time 2019年6月6日下午3:20:33
 * @version
 * @description TODO
 */
package com.briup.ch05;

public class Rectangle extends Shape{
	private double height;//高
	private double width;//宽
	
	public Rectangle() {
		this(1.0,1.0);
	}
	public Rectangle(double height,double width) {
		this.height = height;
		this.width = width;
	}
	public Rectangle(int x,int y,double height,double width) {
		super(x,y);
		this.height = height;
		this.width =width;
	}
	
	public void draw() {
		System.out.println("draw rectangle:"+getX()+","+getY()+","+height+","+width);
	}

}

