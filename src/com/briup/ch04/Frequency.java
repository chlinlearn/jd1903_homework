/**
 * @author xuchunlin
 * @time 2019年6月5日下午2:12:20
 * @version
 * @description TODO
 */
package com.briup.ch04;

import java.util.Arrays;

//产生100个[1,6]的整数，并统计每个整数出现的频率
public class Frequency {
	public static void main(String[] args) {
		getNumberOfTimes();
	}

	// 生成100个随机数并输出每个数出现的频率
	public static void getNumberOfTimes() {
		// 生成随机数,并用数组存储
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			int num = (int) (Math.random() * 6 + 1); 
			array[i] = num;
		}
		System.out.println("排序前：" + Arrays.toString(array));

		/*int[] array1 = { 1, 1, 2, 3, 4 };
		int[] array2 = { 1, 1, 2, 2, 2 };*/

		print(array);
	}

	public static void print(int[] array) {
		// 数组排序
		sortByBubble(array);
		

		// 求数组元素的值出现的频率
		int count = 1;
		// 总次数
		int sum = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				count++;
				// 若出现倒数第一个与倒数二个数相同时
				if (i == array.length - 2) {
					sum += count;
					System.out.println(array[i] + "出现" + count + "次");
					break;
				}
				continue;
			}
			sum += count;
			System.out.println(array[i] + "出现" + count + "次");
			// 重置计数
			count = 1;
			// 若出现倒数第一个与倒数二个数不同时
			if (i == array.length - 2) {
				sum += count;
				System.out.println(array[i + 1] + "出现" + 1 + "次");
				break;
			}

		}
		System.out.println("总次数:" + sum);
	}

	// 对数组冒泡排序
	private static void sortByBubble(int[] array) {
		// 对数组从小到大排序
		for (int i = 0; i < array.length - 1; i++) {
			boolean flag = false;
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
		}
		System.out.println("排序后：" + Arrays.toString(array));
	}
	
}
