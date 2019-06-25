package com.briup.thread;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/24/19:50
 * @description: 创建线程安全队列
 */

import java.util.List;
import java.util.Vector;

public class MyQueue {
    private int size = 0;
    private List vector;//Vector线程安全

    public MyQueue(){
        vector = new Vector();
    }
    public int size(){
        return size;
    }

    public void in(Object obj){
        vector.add(obj);
        size++;
    }

    public Object out(){
        if (size==0){
            return 0;
        }
        Object obj = vector.get(0);
        vector.remove(0);
        size--;
        return obj;
    }

}
