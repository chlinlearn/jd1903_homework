package com.briup.io;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/27/18:44
 * @description: 实现堆栈功能
 */

import java.util.List;
import java.util.Vector;

public class MyStack {
    private int size = 0;
    private List<Object> vecter = null;

    public MyStack(){
        vecter = new Vector<Object>();
    }

    public synchronized void push(Object obj){
        if (obj==null){
            return;
        }
        vecter.add(obj);
        size++;
    }

    public synchronized Object pop(){
        if (isEmpty()){
            System.out.println("栈空");
            return null;
        }
        Object temp = vecter.get(size-1);
        vecter.remove(--size);
        return temp;
    }

    public void remove(int index){
        if (index>=size){
            System.out.println("要移除的元素不存在");
            return;
        }
        vecter.remove(index);
        size--;
    }

    public void insert(Object obj,int index){
        if (index>=size){
            System.out.println("要插入的位置不存在");
        }
        if (obj==null){
            System.out.println("要插入的元素为空");
        }
        vecter.add(index,obj);
        size++;
    }

    public void removeAll(){
        vecter.removeAll(vecter);
        size = 0;
    }

    public boolean isEmpty(){
        if (size<=0){
            return true;
        }else {
            return false;
        }
    }

    public int size(){
        return size;
    }

    public void print(){
        for (int i=0;i<size;i++){
            System.out.print(vecter.get(i)+",");
        }
        System.out.println();
    }
}

class Test{
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        stack.print();
        System.out.println(stack.pop());
        System.out.println(stack.size());
        stack.print();
    }
}
