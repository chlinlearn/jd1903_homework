/**
 * @author xuchunlin
 * @time 2019年6月12日下午7:59:57
 * @version
 * @description TODO
 */
package com.briup.ch06.day09;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

import com.briup.tools.Sort;

public class NumberString {
	private static String str = "141234121283";
	static HashMap<Integer, Integer> map = new HashMap<>();
	
	public static HashMap<Integer, Integer> findMost(String str) {
		int num = 0;		
		char[] c = str.toCharArray();
		System.out.println(Arrays.toString(c));
		int[] array = new int[c.length];
		
		for (int i = 0; i < c.length; i++) {
			array[i] = Integer.parseInt(String.valueOf(c[i]));
		}		
		//排序
		Sort.sortByInsert(array);	
		System.out.println(Arrays.toString(array));
		
		int count = 1;
		for (int i = 0; i < array.length-1; i++) {			
			if (array[i]==array[i+1]) {
				if (i==array.length-2) {
					num = array[i];
					count++;
					map.put(count, num);
					System.out.println(num+" "+count);
					break;
				}
				count++;
				continue;
			}else {
				num = array[i];
                map.put(count, num);
				System.out.println(num+" "+count);
				count = 1;
				if (i==array.length-2) {
					num = array[i+1];
                    map.put(count, num);
					System.out.println(num+" "+count);
				}
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = findMost(str);
        Set<Integer> set = map.keySet();
        int a = 0;
        for(Integer temp:set){
            if (a<temp){
                a = temp;
            }
        }
        System.out.println("出现次数最多的数字："+map.get(a));
	}
}

