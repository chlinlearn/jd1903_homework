package com.briup.ch07;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest2{
	public static void main(String[] args) {
		Set<String> c = new TreeSet<String>(new MyComparator<String>());
		c.add("HashSet");
		c.add("ArrayList");
		c.add("TreeMap");
		c.add("HashMap");
		c.add("TreeSet");
		c.add("LinkedList");
    
		Iterator<String> it = c.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}

class MyComparator<T extends String> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        T s1 = (T)o1;
        T s2 = (T)o2;

        //升序
        //return s1.compareTo(s2);

        //降序
        return -s1.compareTo(s2);
    }
}
