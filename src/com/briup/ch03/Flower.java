package com.briup.ch03;

public class Flower{
	public static void flower(){
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		for(int i=100;i<1000;i++){
			a1 = i%100%10;
			a2 = i/10%10;
			a3 = i/100;
			if(i==(Math.pow(a1,3)+Math.pow(a2,3)+Math.pow(a3,3))){
				System.out.print(i+" ");
			}
		}
	}
	
	
	public static void main(String[] args){
		flower();
	}
}