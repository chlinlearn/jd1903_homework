/**
 * @author xuchunlin
 * @time 2019年6月6日下午3:11:38
 * @version
 * @description TODO
 */
package com.briup.ch05;

public class Circle extends Shape{
	private double r;//圆半径
	
	public Circle() {
		this(1.0);
	}
	public Circle(double r) {
		this.r = r;
	}
	public Circle(int x,int y,double r) {
		super(x,y);
		this.r = r;
	}
	public void draw() {
		System.err.println("draw in circle:"+getX()+","+getY()+","+r);
	}
}

