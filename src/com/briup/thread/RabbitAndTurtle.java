package com.briup.thread;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/24/18:53
 * @description: 继承Thread类，实现赛跑的逻辑
 */

import java.util.function.ObjLongConsumer;

public class RabbitAndTurtle extends Thread {
    private double rand;//随机数
    private static boolean isStop = false;//静态变量共享
    private static Race rabbit;//兔子实例
    private static Race turtle;//乌龟实例
    private final static Object obj = new Object();

    public RabbitAndTurtle() {
    }

    public RabbitAndTurtle(String name) {
        super(name);
    }

    @Override
    public void run() {
        int sum = 0;//跑动距离
        while (sum < 100) {
            if (isStop) {
                return;
            }
            rand = Math.random();
            if (rand <= 0.3) {
                sum += rabbit.getRace();
                System.out.println(rabbit.getName() + "跑了" + sum);
            } else {
                sum += turtle.getRace();
                System.out.println(turtle.getName() + "跑了" + sum);
            }
        }
        isStop = true;

    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("start....");
        rabbit = new Race("兔子", 2);
        turtle = new Race("乌龟", 1);

        RabbitAndTurtle r = new RabbitAndTurtle("兔子");
        RabbitAndTurtle t = new RabbitAndTurtle("乌龟");

        r.start();
        t.start();
        r.join();
        t.join();
        System.out.println("end.....");
    }
}
