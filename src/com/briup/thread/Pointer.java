package com.briup.thread;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/25/9:11
 * @description: TODO
 */

import com.briup.ch07.Point;

import java.util.ArrayList;

public class Pointer extends Thread {
    private Storage storage;

    public Pointer(Storage storage){
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0;i<100;i++) {
            synchronized (storage) {
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
