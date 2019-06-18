/**
 * @author xuchunlin
 * @time 2019年6月11日下午7:11:03
 * @version
 * @description TODO
 */
package com.briup.ch06.day08;

import java.util.Arrays;

public class T3 {
	//生成一个长度为99的数组
	public static int[] getArray() {
		int[] array = new int[99];
		int num = (int)(Math.random()*100+1);
		for (int i = 1; i < 100; i++) {
			if (i==num) {
				continue;
			}
			array[i-1] = i;
		}
		return array;
	}
	
	//找出缺少的那个数
	public static int getNum(int[] array) {
		int num = 0;
		for (int i = 1; i < array.length-1; i++) {
			if (array[i-1] !=array[i]-1) {
				num = i;
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		int[] array = getArray();
		System.out.println(Arrays.toString(array));
		int num = getNum(array);
		System.out.println(num);
	}
}

