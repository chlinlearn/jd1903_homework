package com.xcl.Test;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/19/15:29
 * @description: TODO
 */

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String,User> t = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        User s1 = new User("bb",20,98);
        User s2 = new User("dd",20,90);
        User s3 = new User("aa",18,100);
        User s4 = new User("cc",19,86);
        t.put(s1.getName(),s1);
        t.put(s2.getName(),s2);
        t.put(s3.getName(),s3);
        t.put(s4.getName(),s4);
        System.out.println(t);
    }
}
