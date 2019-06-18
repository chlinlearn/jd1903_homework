package com.briup.ch03;

public class Prime{
	public static void prime(){
		int count = 0;
		for(int i=101;i<=200;i++){
			boolean flag = true;
			for(int j=2;j<i;j++){
				if((i%j) == 0){
					flag = false;
					break;
				}
			}
			if(flag==true){
				count++;
				System.out.print(i+" ");
			}
		}
		System.out.print("\n");
		System.out.print("共有"+count+"个素数");
	}
	
	public static void main(String[] args){
		prime();
	}
}