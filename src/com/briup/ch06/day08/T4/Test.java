/**
 * @author xuchunlin
 * @time 2019年6月11日下午7:35:49
 * @version
 * @description TODO
 */
package com.briup.ch06.day08.T4;

public class Test {
	public static void main(String[] args) {
		Person f = new Father();
		Person m = new Mother();
		Person b = new Baby();
		
		Father f1 = new Father();
		Mother m1 = new Mother();
		Baby b1 = new Baby();
		
		b.eat();
		f.eat();
		m.eat();
		
		f1.work();
		m1.manager();
		b1.cry();
	}
}

