package com.xcl.javafkjy;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/26/9:27
 * @description: 测试yield
 */

public class YieldTest extends Thread{
    public YieldTest(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i=0;i<30;i++){
            System.out.println(getName()+" "+i);
            if (i==20){
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new YieldTest("高级");
        t1.setPriority(MAX_PRIORITY);
        Thread t2 = new YieldTest("低级");
        t2.setPriority(MIN_PRIORITY);
        t2.start();
        t1.start();

    }
}
