package com.briup.thread;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/24/20:04
 * @description: TODO
 */

public class MyQueueTest {
    private static MyQueue queue;

    class InsertThread extends Thread{
        @Override
        public void run() {
            for (int i=1;i<=20;i++){
                queue.in(i);
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class ReadThread extends Thread{
        @Override
        public void run() {
            System.out.println(queue.out());
        }
    }

    public static void main(String[] args) {
        queue = new MyQueue();
        //queue.in(10);
        //queue.in(20);
        Thread insert = new MyQueueTest().new InsertThread();
        Thread read = new MyQueueTest().new ReadThread();
        insert.start();
        read.start();

        Thread insert1 = new MyQueueTest().new InsertThread();
        Thread read1 = new MyQueueTest().new ReadThread();
        insert1.start();
        read1.start();

        Thread insert2 = new MyQueueTest().new InsertThread();
        Thread read2 = new MyQueueTest().new ReadThread();
        insert2.start();
        read2.start();

        Thread insert3 = new MyQueueTest().new InsertThread();
        Thread read3 = new MyQueueTest().new ReadThread();
        insert3.start();
        read3.start();
    }
}
