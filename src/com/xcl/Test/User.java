package com.xcl.Test;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/19/15:21
 * @description: TODO
 */

public class User {
    private String name;
    private int age;
    private int score;

    public User() {
    }

    public User(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score='" + score + '\'' +
                '}';
    }
}
