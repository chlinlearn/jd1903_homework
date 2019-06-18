/**
 * @author xuchunlin
 * @time 2019年6月11日下午4:18:49
 * @version
 * @description TODO
 */
package com.briup.ch06.day08;

public class Fish extends Animal implements Pet{
	private String name;
	
	public Fish() {
		this(0, "shark");
	}
	
	public Fish(int legs,String name) {
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
		System.out.println("fish play...");
	}
	
	@Override
	public void walk() {
		System.out.println("fish walk...");
	}
	
	@Override
	public void eat() {
		System.out.println("fish eat...");
	}
}

