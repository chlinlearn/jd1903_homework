/**
 * @author xuchunlin
 * @time 2019年6月11日下午7:25:33
 * @version
 * @description TODO
 */
package com.briup.ch06.day08.T4;

public abstract class Person {
	protected int eyes;
	protected int mouth;
	
	public void eat() {
		System.out.println("吃饭....");
	}
	
	//判断性别,(0)男,(1)女
	public String gender(int n) {
		if (n==0) {
			return "男";
		}
		if (n==1) {
			return "女";
		}
		return "未知";
	}

}

