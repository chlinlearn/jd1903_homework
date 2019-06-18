package com.briup.ch03;

public class LoopTest{
	public static int byWhile(){
		int i = 1;
		int sum = 0;
		while(i<=10){
			sum += i;
			i++;
		}
		return sum;
	}
	
	public static int byDo(){
		int i = 1;
		int sum = 0;
		do{
			sum += i;
			i++;
		}while(i<=10);
		return sum;
	}

	public static int byFor(){
		int sum = 0;
		for(int i=1;i<=10;i++){
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args){
		System.out.println("byWhile():"+byWhile());
		System.out.println("byDo():"+byDo());
		System.out.println("byFor():"+byFor());
	}
}