/**
 * @author xuchunlin
 * @time 2019年6月11日下午7:34:37
 * @version
 * @description TODO
 */
package com.briup.ch06.day08.T4;

public class Baby extends Father{
	public void cry() {
		System.out.println("哭....");
	}
	
	@Override
	public void eat() {
		System.out.println("吃奶....");
	}
}

