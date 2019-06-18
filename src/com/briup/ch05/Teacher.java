package com.briup.ch05;

public class Teacher
{
	private String name;	
	private int age;			
	private double salary;
	
	public Teacher() {
		
	}
	public Teacher(String name,int age,double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return "name:"+name+"\tage:"+age+"\tsalary:"+salary;
	}
	
	//用于年龄增加的方法
	public void increaseAge(){
		age++;
	}	
}
