package com.briup.ch02;

public class StudentTest{
	public static void main(String[] args){
		Student s = new Student();
		s.name = "xcl";
		s.gender = "男";
		s.age = 18;
		
		System.out.println("name="+s.name);
		System.out.println("gender="+s.gender);
		System.out.println("age="+s.age);
		s.increaseAge();
		System.out.println("age="+s.age);
	}
}