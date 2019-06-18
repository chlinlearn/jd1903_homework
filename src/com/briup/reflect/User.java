package com.briup.reflect;

public class User{
	private int id;//id号
	private String name; //用户名
	private String password;//密码

    public User() {

    }

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    //构造器和相应的set,get方法
	public boolean checkName(String name){
	    //实现代码
        return false;
    }
	public User getName(String name){
	    //实现代码
        return new User(1,"jack","123456");
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}