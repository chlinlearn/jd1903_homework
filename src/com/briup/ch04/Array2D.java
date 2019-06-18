/**
 * @author xuchunlin
 * @time 2019年6月4日下午5:01:20
 * @version
 * @description TODO
 */
package com.briup.ch04;

public class Array2D {
	public static void main(String[] args) {
		//为什么不是全部被初始化为0？
		//没有指定长度，也没有给元素赋值，就是一个空数组
		int[][] twoD = new int[4][];
		int[] a1 = {1,2,3,4};
		int[] a2 = {1,2,3,4,5};
		int[] a3 = {1,2,3,4,5,6};
		int[] a4 = {1,2,3,4,5,6,7};
		twoD[0] = a1;
		twoD[1] = a2;
		twoD[2] = a3;
		twoD[3] = a4;
		print(twoD);
		//重新随机赋值
		setTwoD(twoD);
		print(twoD);
		//声明一个一位数组
		int[] oneD = {7,8,9,10};
		//把一位数组赋值给twoD[0]
		twoD[0] = oneD;
		print(twoD);
	}
	//打印数组
	public static void print(int[][] twoD) {
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++) {
				if(twoD[i]!=null) {
					System.out.print(twoD[i][j]+" ");
				}	
			}
			System.out.println();
		}
	}
	
	//赋值
	public static void setTwoD(int[][] twoD) {
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++) {
				int num = (int)(Math.random()*100);
				twoD[i][j] = num;
			}
		}
	}

}

