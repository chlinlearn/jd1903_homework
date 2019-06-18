package com.briup.ch07;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/17/10:56
 * @description: 测试泛型在四则运算中的使用
 */

public class PointTest{
    public static void main(String[] args) {
        Point<Integer,Integer> p = new Point<Integer,Integer>(2,3);
        int res = p.add(p.first,p.second);
        System.out.println(res);
        System.out.println("--------------");
        Point<Integer,Float> p1 = new Point<Integer,Float>(3,2.0f);
        System.out.println(p1.first+p1.second);
        System.out.println(p1.first-p1.second);
        System.out.println(p1.first*p1.second);
        System.out.println(p1.first/p1.second);
        System.out.println("--------------");
        
        Point<Integer,Double> p2 = new Point<Integer,Double>(3,2.0d);
        System.out.println(p2.first+p2.second);
        System.out.println(p2.first-p2.second);
        System.out.println(p2.first*p2.second);
        System.out.println(p2.first/p2.second);
    }
}
