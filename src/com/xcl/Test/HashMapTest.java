package com.xcl.Test;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/19/18:55
 * @description: TODO
 */

import java.util.Comparator;
import java.util.HashMap;

public class HashMapTest implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s1.compareTo(s2);
    }

    public static void main(String[] args) {
        HashMapTest ht = new HashMapTest();
        User s1 = new User("bb",20,98);
        User s2 = new User("dd",20,90);
        User s3 = new User("aa",18,100);
        User s4 = new User("cc",19,86);

        HashMap<String,User> h = new HashMap<>();
        h.put("bb",s1);
        h.put("dd",s2);
        h.put("aa",s3);
        h.put("cc",s4);
    }
}
