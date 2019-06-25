package com.briup.thread;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/25/9:13
 * @description: TODO
 */


public class Test {
    public static void main(String[] args) {
            Storage s = new Storage();
            Thread c = new Counter(s);
            c.setName("Counter");
            Thread p = new Pointer(s);
            p.setName("Pointer");
            c.start();
            p.start();
    }
}
