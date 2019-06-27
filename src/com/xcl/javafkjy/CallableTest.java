package com.xcl.javafkjy;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/25/18:57
 * @description: 函数式编程，lambda(1.8版本)
 */

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) {
        FutureTask<Integer> task = new FutureTask<>((Callable<Integer>)()->{
            int i = 0;
            for (;i<100;i++){
                System.out.println(Thread.currentThread().getName()+"线程i的值："+i);
            }
            //call()方法可以有返回值
            return i;
        });
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"线程i的值："+i);
            if (i==20){
                new Thread(task,"有返回值得线程").start();
            }
        }
        try {
            //get()方法会阻塞主线程，直到call()方法执行完并返回
            System.out.println("子线程的返回值"+task.get());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
