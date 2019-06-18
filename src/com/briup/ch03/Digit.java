package com.briup.ch03;

import java.util.*;

public class Digit{
	public static void loop(){
		//ArrayList list = new ArrayList();
		ArrayList<Integer> list = new ArrayList<>();
		int a = 0;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i==j){
					continue;
				}
				for(int k=1;k<=4;k++){
					if(j==k || i==k){
						continue;
					}
					int temp = i*100+j*10+k;
					list.add(temp);
				}
			}
		}
		System.out.println(list);
	}
	
	public static void main(String[] args){
		loop();
	}
}