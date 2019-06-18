/**
 * @author xuchunlin
 * @time 2019年6月4日下午4:49:12
 * @version
 * @description TODO
 */
package com.briup.ch04;

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] array1 = {2,3,5,7,11,13,17,19};
		int[] array2;
		print(array1);
		array2 = array1;
		changeArrayByEven(array2);
		print(array2);
		print(array1);
	}
	//打印数组
	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	//修改array2的偶索引的值，改为其索引值
	public static void changeArrayByEven(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if(i%2==0) {
				array[i] = i;
			}
		}
	}
}

