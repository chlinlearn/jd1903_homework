package com.briup.thread;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/25/9:07
 * @description: TODO
 */

public class Counter extends Thread{
    private Storage storage;

    public Counter(Storage storage){
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            synchronized (storage) {
                storage.getList().add(0, i);
                System.out.println(getName() + ":" + storage.getList().get(0));
            }
            try {
                sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
