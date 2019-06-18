package com.briup.reflect;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/18/16:18
 * @description: TODO
 */

public class Account {
    private int id;
    private String name;
    private double balance;

    public Account(){

    }
    public Account(int id,String name,double balance){
        this.balance = balance;
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void set(double money){
        balance += money;
    }
    public double get(double money){
        balance -= money;
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
