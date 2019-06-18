package com.briup.ch07;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/17/9:21
 * @description: 使用泛型定义一个数组
 */

import java.util.ArrayList;
import java.util.List;

public class GenericArray<T> implements Iterator {
    private static int size = 0;
    private static int position = -1;
    List<T> list = new  ArrayList<T>();

    private void add(T e){
        list.add(e);
        size++;
    }

    private T get(int index){
        return list.get(index);
    }

    public GenericArray() {
        super();
    }

    @Override
    public boolean hasNext() {
        while (position+1<size){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        return list.get(++position);
    }

    @Override
    public Object remove() {
        return list.remove(position--);
    }

    public static void main(String[] args) {
        GenericArray<String> g = new GenericArray<String>();
        g.add("hello");
        g.add("world");
        g.add("12138");
        for (int i=0 ; i < size; i++){
            System.out.println(g.get(i));
        }
        System.out.println("-------------");
        while (g.hasNext()){
            System.out.println(g.next());
        }

    }

}
