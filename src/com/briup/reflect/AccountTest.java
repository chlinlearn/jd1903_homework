package com.briup.reflect;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/18/16:20
 * @description: TODO
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AccountTest {
    public static void main(String[] args) throws Exception{
        Class clz = Class.forName("com.briup.reflect.Account");
        Account account1 = (Account) clz.newInstance();
        /*Constructor con = clz.getConstructor(int.class,String.class,double.class);
        Account account2 = (Account)con.newInstance(1000,"briup",0.0);*/
        account1.setId(1000);
        account1.setName("briup");
        account1.setBalance(10000.0);
        System.out.println(account1);
        /*account1.set(100.0);
        account1.get(1000.0);
        System.out.println(account1);*/
        Method method = clz.getMethod("set",double.class);
        method.invoke(account1,100);
        Method method1 = clz.getMethod("get",double.class);
        method1.invoke(account1,1000);
        System.out.println(account1);
    }
}
