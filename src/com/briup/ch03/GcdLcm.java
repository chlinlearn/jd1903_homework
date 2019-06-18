package com.briup.ch03;


public class GcdLcm{
	public static int gcd(int a,int b){
		int r = 0;
		if(a<b){
			int tmp = b;
			b = a;
			a = tmp;
		}
		r = a%b;
		if(r==0){
			return b;
		}else{
			return gcd(b,r);
		}
	}
	//�����Լ��(�������),���������ܴ�ʱ���ݹ�������������ܵ͡�
	public static int gcd2(int a,int b){
		if(a==b){
			return a;
		}else if(a>b){
			return gcd2(a-b,b);
		}else{
			return gcd2(b-a,a);
		}
	}
	
	public static int lcm(int a,int b,int gcd){
		return a*b/gcd;
	}
	
	public static void main(String[] args){
		System.out.println(gcd(10,8));
		System.out.println(lcm(10,8,gcd(10,8)));
	}
}