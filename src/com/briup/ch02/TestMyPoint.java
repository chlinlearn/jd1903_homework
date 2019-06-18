package com.briup.ch02;

public class TestMyPoint{
	public static void main(String[] args){
		MyPoint start = new MyPoint();
		MyPoint end = new MyPoint();
		start.x = 10;
		start.y = 10;
		end.x = 20;
		end.y = 30;
		System.out.println("Start point is "+start);
		System.out.println("End point is "+end);
		
		MyPoint stray = end;
		System.out.println("Stray point is "+stray);
		System.out.println("End point is "+end);
		
		stray.x = 25;
		stray.y = 35;
		System.out.println("Stray point is "+stray);
		System.out.println("End point is "+end);
		System.out.println("Start point is "+start);
	}
}