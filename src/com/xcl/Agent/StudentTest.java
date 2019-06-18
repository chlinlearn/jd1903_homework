package com.xcl.Agent;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/17/15:47
 * @description: TODO
 */
//限制StudentTest只能使用Student类中的add()方法
//如果继承就会拥有Student的所有方法，所以需要采用代理的方式
public class StudentTest {
    public static void main(String[] args) {
        StudentAgent sg = new StudentAgent();
        sg.add();
    }
}
