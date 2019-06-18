/**
 * @author xuchunlin
 * @time 2019年6月11日下午4:20:56
 * @version
 * @description TODO
 */
package com.briup.ch06.day08;

public class TestAnimals {
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal fish = new Fish();
		Animal spider = new Spider(8);
		
		Cat c = new Cat();
		Fish f = new Fish();
		Spider s = new Spider(8);
		
		cat.eat();
		fish.eat();
		spider.eat();
		//子类没有重写，调用父类方法
		cat.walk();
		spider.walk();
		//子类有重写，调用子类方法
		fish.walk();
		
		c.play();
		f.play();
		
		c.eat();
		c.walk();
		
		System.out.println("叫"+c.getName()+"的cat有"+c.legs+"条腿");
		System.out.println("叫"+f.getName()+"的fish有"+f.legs+"条腿");
		System.out.println("spider有"+s.legs+"条腿");
	}
}

