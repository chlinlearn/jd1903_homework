/**
 * @author xuchunlin
 * @time 2019年6月14日上午9:20:06
 * @version
 * @description TODO
 */
package com.briup.ch07;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Set set = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Integer i1= (Integer)o1;
				Integer i2= (Integer)o2;
                System.out.println("i1="+i1+",i2="+i2);
				if (i2%2==0) {
					return i2-i1;
				}
				return i1-i2;
			}
		});
		
		for (int i = 1; i <= 10; i++) {
			set.add(i);
		}
		System.out.println(set.toString());
	}
}

