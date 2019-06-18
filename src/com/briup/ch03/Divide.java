package com.briup.ch03;


public class Divide{
	public static void divide(int num){
		System.out.print(num+"=");
		for(int i=2;i<=num;i++) {
			while(num%i==0 && num!=i) {
				num=num/i;
				System.out.print(i+"*");
			}
			if(num==i) {
				System.out.print(i);
				break;
			}
		}
	}
	
	public static void main(String[] args){
		divide(90);
	}
}