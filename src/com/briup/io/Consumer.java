package com.briup.io;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/27/19:36
 * @description: TODO
 */

import com.xcl.javafkjy.ConditionTest;

import javax.sound.midi.Soundbank;

public class Consumer extends Thread {
    private MyStack stack;
    public Consumer(MyStack stack){
        this.stack = stack;
    }

    @Override
    public void run() {
        for (int i=0;i<20;i++){
            if (stack.isEmpty()){
                try {
                    sleep(300);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            char c = (Character) stack.pop();
            System.out.println("Consumer:"+c);
            try {
                sleep(300);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
