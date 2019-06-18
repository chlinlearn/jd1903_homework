package com.briup.ch03;

public class Test{
	public static int clearEightBit(int num){
		return num >> 8;
	}
	
	public static int setBit(int num){
		int n = 0;
		for(int i=1; i<=16;i++){
			n = num | (1<<(i-1));
		}
		return n;
	}
	
	public static void numChange(int n1,int n2){
		for(int i=1;i<=32;i++){
			if((n1 & (1<<(i-1)))!=(n2 & (1<<(i-1)))){
				n1 = n1 ^ (1<<(i-1));
				n2 = n2 ^ (1<<(i-1));
			}
		}
		System.out.print(n1+" "+n2);
	}
	
	public static void print(int num){
		System.out.print(num+"\t");
		int count = 0;
		for(int i=31;i>=0;i--){
			count++;
			System.out.print(num>>i&1);
			if(count%4==0){
				System.out.print(" ");
			}
		}
		System.out.print("\n");
	}
	
	public static void main(String[] args){
		int c1 = clearEightBit(10);
		System.out.println(c1);	
		int c2 = setBit(10);
		System.out.println(c2);	
		numChange(10,9);
	}
}