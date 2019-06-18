/**
 * @author xuchunlin
 * @time 2019年6月11日下午4:15:35
 * @version
 * @description TODO
 */
package com.briup.ch06.day08;

public class Cat extends Animal implements Pet{
	private String name;
	
	public Cat() {
		this(4, "kity");
	}

	public Cat(Integer legs,String name) {
		super(legs);
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void play() {
		System.out.println("cat play...");
	}
	
	@Override
	public void eat() {
		System.out.println("cat eat....");
	}
}

