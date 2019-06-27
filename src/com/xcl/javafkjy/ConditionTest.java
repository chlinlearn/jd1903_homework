package com.xcl.javafkjy;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/26/10:23
 * @description: Lock锁通过Condition进行线程间的通信
 */

import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionTest extends Thread {
    private double balance = 0;
    private boolean flag = false;
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public double getBalance() {
        lock.lock();
        try {
            try {
                flag = true;
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            return balance;
        } finally {
            lock.unlock();
        }
    }

    public void setBalance(double balance) {
        lock.lock();
        this.balance += balance;
        try {
            if (!flag){
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(getName()+"存钱"+balance);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void run() {
        setBalance(1000);
    }

    public static void main(String[] args) {
        Thread t1=new ConditionTest();
        Thread t2 = new ConditionTest();
        t1.start();
        t2.start();
    }
}
