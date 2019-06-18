package com.briup.tools;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/14/15:14
 * @description: TODO
 */

import com.briup.ch05.Student;

public class TupleTest {
    private static TwoTuple<String,Integer> test(){
        return new TwoTuple<String,Integer>("hello",12138);
    }

    private static ThreeTuple<String,Student,Stack> test2(){
        return new ThreeTuple<String,Student,Stack>("world",
                new Student("tom","male",22),
                new Stack(4));
    }

    public static void main(String[] args) {
        TwoTuple t = test();
        System.out.println(t.first+" "+t.second);

        ThreeTuple t2 = test2();
        System.out.println(t2.second.toString());
        System.out.println(t2.three);
        //new Student("tom","male",22).getName();
        //t2.second.getName();
    }
}
