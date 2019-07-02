package com.briup.io;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/27/19:15
 * @description: TODO
 */

public class Producer extends Thread{
    private MyStack stack;
    public Producer(MyStack stack){
        this.stack = stack;
    }

    @Override
    public void run() {
        for(int i=0;i<20;i++){
            char c = randomChar();
            stack.push(c);
            System.out.println("Producer:"+c);
            try {
                sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    //生成“a-z"的随机字母
    public static char randomChar(){
        String str = "qwertyuiopasdfghjklzxcvbnm";
        char[] c = str.toCharArray();
        int rand = (int)(Math.random()*26);
        return c[rand];
    }
}

class Test2{
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        Producer p = new Producer(stack);
        Consumer c = new Consumer(stack);
        p.start();
        c.start();
    }
}
