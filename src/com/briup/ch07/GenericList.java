package com.briup.ch07;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/17/11:21
 * @description: TODO
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericList<E> {
    List<E> list = new ArrayList<>();

    public void change(List<E> list,int x,int y){
        E temp = list.get(y);
        list.set(y,list.get(x));
        list.set(x,temp);
    }
    //collection中有set无序，list有序
    public void toArray(Collection<E> coll,E[] array){
        int i = 0;
       for(E temp:coll){
            array[i] = temp;
            i++;
        }
    }

    public static void main(String[] args) {
        GenericList<String> g = new GenericList<>();
        g.list.add("hello");
        g.list.add("world");
        /*g.change(g.list,0,1);
        for (int i=0;i<g.list.size();i++){
            System.out.println(g.list.get(i));
        }*/

        System.out.println("--------------");
        String[] array = new String[g.list.size()];
        g.toArray(g.list,array);
        for (int i=0;i<g.list.size();i++){
            System.out.println(array[i]);
        }
    }

}
