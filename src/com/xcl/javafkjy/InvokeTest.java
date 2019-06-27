package com.xcl.javafkjy;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/25/19:24
 * @description: 测试直接调用run()方法，再调用start()方法
 */

public class InvokeTest extends Thread {
    @Override
    public void run() {
        System.out.println("run....."+getName());
    }

    public static void main(String[] args) {
        InvokeTest t = new InvokeTest();
        t.run();//调用了run方法就不要再启动start方法
        t.start();
    }
}
