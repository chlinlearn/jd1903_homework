/**
 * @author xuchunlin
 * @time 2019年6月6日下午3:09:33
 * @version
 * @description TODO
 */
package com.briup.ch05;

public class Shape {
	private int x;
	private int y;
	
	public Shape() {
		
	}
	public Shape(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void draw() {
		System.out.println("Shape draw");
	}

}

