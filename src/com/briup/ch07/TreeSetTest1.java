package com.briup.ch07;

import java.util.*;

import jdk.internal.dynalink.beans.StaticClass;

/**
 * 	对TreeSet中的元素"HashSet"、"ArrayList"、"TreeMap"、"HashMap"、
 * 	"TreeSet"、"LinkedList"进行升序和倒序排列列
 */
public class TreeSetTest1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//升序
		TreeSet t = new TreeSet();
		t.add("HashSet");
		t.add("ArrayList");
		t.add("TreeMap");
		t.add("HashMap");
		t.add("TreeSet");
		t.add("LinkedList");
		System.out.println(t.toString());

		System.out.println("-------------------");
		//降序,匿名内部类实现
		TreeSet ts = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				String h1 = (String)o1;
				String h2 = (String)o2;
				//return h2.toString().compareTo(h1.toString());
				return h2.compareTo(h1);
			}			
		});
		ts.add("HashSet");
		ts.add("ArrayList");
		ts.add("TreeMap");
		ts.add("HashMap");
		ts.add("TreeSet");
		ts.add("LinkedList");
		System.out.println(ts.toString());
		
		//降序,静态内部类实现
		System.out.println("-------------------");
		TreeSet t2 = new TreeSet(new TreeSetTest1.TreeSetCompare());
		t2.add("HashSet");
		t2.add("ArrayList");
		t2.add("TreeMap");
		t2.add("HashMap");
		t2.add("TreeSet");
		t2.add("LinkedList");
		System.out.println(ts.toString());
		
	}
	
	//静态内部类实现
	public static class TreeSetCompare implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			String h1 = (String)o1;
			String h2 = (String)o2;
			return h2.compareTo(h1);
		}
		
	}
}
