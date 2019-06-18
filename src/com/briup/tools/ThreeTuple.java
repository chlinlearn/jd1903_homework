package com.briup.tools;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/14/15:16
 * @description: TODO
 */

public class ThreeTuple<A,B,C> extends TwoTuple<A,B> {
    public final C three;
    public ThreeTuple(A a, B b,C c) {
        super(a, b);
        this.three = c;
    }

}
