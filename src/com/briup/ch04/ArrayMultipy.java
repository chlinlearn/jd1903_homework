/**
 * @author xuchunlin
 * @time 2019年6月4日下午4:43:19
 * @version
 * @description TODO
 */
package com.briup.ch04;

public class ArrayMultipy {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int res = 1;
		for(int i=0;i<array.length;i++) {
			res *= array[i];
		}
		System.out.println("积为："+res);
	}
}

