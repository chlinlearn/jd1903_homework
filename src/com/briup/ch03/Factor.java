package com.briup.ch03;

public class Factor{
	public static void factor(int num){
		int res = 1;
		for(int i = num;i>0;i--){
			res *= i;
		}
		System.out.println(num+"! = "+res);
	}
	
	public static void main(String[] args){
		factor(4);
	}
}