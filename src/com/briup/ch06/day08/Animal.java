/**
 * @author xuchunlin
 * @time 2019年6月11日下午4:11:27
 * @version
 * @description TODO
 */
package com.briup.ch06.day08;

public abstract class Animal {
	protected int legs;
	
	protected Animal(int legs) {
		this.legs = legs;
	}
	
	public void walk() {
		
	}
	
	public abstract void eat();
}

