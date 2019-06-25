package com.briup.thread;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/24/18:50
 * @description: 产生RabbitAndTurtle的两个实例，分别代表兔子和乌龟
 */

public class Race {
    private String name;//哪种动物
    private int race;//每次前进的距离

    public Race(String name,int race){
        this.name = name;
        this.race = race;
    }
    public String getName(){
        return name;
    }
    public int getRace(){
        return race;
    }

}
