package com.briup.ch07;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/17/10:53
 * @description: TODO
 */

public class Point<E1 extends Number,E2 extends Number> {
    public E1 first;
    public E2 second;

    public Point(E1 e1,E2 e2){
        this.first = e1;
        this.second = e2;
    }

    public Point(){

    }

    public E1 getFirst() {
        return first;
    }

    public E2 getSecond() {
        return second;
    }

    public void setFirst(E1 first) {
        this.first = first;
    }

    public void setSecond(E2 second) {
        this.second = second;
    }

    public Integer add(E1 e1,E2 e2){
        Integer res = (Integer)e1+(Integer)e2;
        return res;
    }
}
