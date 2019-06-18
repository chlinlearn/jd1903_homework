/**
 * @author xuchunlin
 * @time 2019年6月11日下午6:49:48
 * @version
 * @description TODO
 */
package com.briup.ch06.day08;

public class T2 {
	static int count = 0;
	public static double power(int n1,int n2) {
		if (n1%n2 != 0) {
			return -1.0;
		}
		if (n1==1) {
			return count;
		}
		n1 /= n2;
		count++;
		return power(n1, n2);
	}
	public static void main(String[] args) {
		double n = power(3, 2);
		System.out.println(n);
	}

}

