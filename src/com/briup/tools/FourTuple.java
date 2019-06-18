package com.briup.tools;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/14/15:18
 * @description: TODO
 */

public class FourTuple<A,B,C,D> extends ThreeTuple<A,B,C> {
    public final D four;
    public FourTuple(A a, B b, C c,D d) {
        super(a, b, c);
        this.four = d;
    }
}
