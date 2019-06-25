package com.xcl.Test;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/19/15:22
 * @description: TODO
 */

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        /*TreeSet<User> t = new TreeSet<User>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/
        TreeSet<User> t = new TreeSet<User>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.getAge()-o2.getAge()==0)
                    return o1.getName().compareTo(o2.getName());
                return o1.getAge()-o2.getAge();
            }
        });
        t.add(new User("tom",20,98));
        t.add(new User("jack",20,90));
        t.add(new User("ali",18,100));
        t.add(new User("lucy",19,86));
        System.out.println(t);
    }
}
