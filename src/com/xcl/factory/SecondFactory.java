package com.xcl.factory;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/17/20:19
 * @description: TODO
 */

public class SecondFactory implements Service {
    public SecondFactory() {
        super();
    }

    @Override
    public void method1() {
        System.out.println("SecondFactory method1()...");
    }

    @Override
    public void method2() {
        System.out.println("SecondFactory method2()...");
    }
}
