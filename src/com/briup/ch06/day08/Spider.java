/**
 * @author xuchunlin
 * @time 2019年6月11日下午4:18:25
 * @version
 * @description TODO
 */
package com.briup.ch06.day08;

public class Spider extends Animal{

	protected Spider(int legs) {
		super(legs);
	}

	@Override
	public void eat() {
		System.out.println("spider eat...");
	}

}

