package com.briup.ch02;

import java.math.*;

public class TypeTest{
	public static void main(String[] args){

		BigInteger a = new BigInteger("1000");
		
		//a.valueOf(24*60*60*1000*1000);
		BigInteger b = new BigInteger("24");
		//b.valueOf(24*60*60*1000);
		BigInteger c = a.divide(b);
		System.out.println(c);
	}
}