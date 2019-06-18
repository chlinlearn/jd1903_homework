package com.briup.tools;

import com.sun.org.apache.bcel.internal.generic.FNEG;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/14/15:10
 * @description: TODO
 */
//元组类库
public class TwoTuple<A,B> {
    public final A first;//final保证了安全性，不需要get方法；
    public final B second;

    public TwoTuple(A a,B b){
        this.first = a;
        this.second = b;
    }
}
