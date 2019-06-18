package com.xcl.factory;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/17/20:18
 * @description: TODO
 */

public class FirstFactory implements Service{
    public FirstFactory() {
        super();
    }

    @Override
    public void method1() {
        System.out.println("FirstFactory method1()...");
    }

    @Override
    public void method2() {
        System.out.println("FirstFactory method2()...");
    }
}
