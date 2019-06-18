package com.briup.ch03;

public class MultiplicationTable{
	public static void type1(){
		for(int i=1;i<10;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"= "+i*j+"\t");
			}
			System.out.print("\n");
		}
	}
	
	public static void type2(){
		for(int i=9;i>0;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"= "+i*j+"\t");
			}
			System.out.print("\n");
		}
	}
	
	public static void type3(){
		for(int i=1;i<10;i++){
			for(int j=9;j>0;j--){
				if(j<=i){
					System.out.print(j+"*"+i+"= "+i*j+"\t");
				}else{
					System.out.print("\t");
				}
			}
			System.out.print("\n");
		}
	}
	
	public static void type4(){
		for(int i=9;i>0;i--){
			for(int j=9;j>0;j--){
				if(j<=i){
					System.out.print(j+"*"+i+"= "+i*j+"\t");
				}else{
					System.out.print("\t");
				}
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args){
		//type1();
		//System.out.println("----------------------------------------");
		//type2();
		//System.out.println("----------------------------------------");
		//type3();
		type4();
	}
}