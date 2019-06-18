package com.briup.reflect;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/18/15:30
 * @description: TODO
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest {
    public static void main(String[] args) throws Exception{
        //获取类镜像
        Class clz = Class.forName("com.briup.reflect.User");
        //创建对象
        User user = (User)clz.newInstance();
        Constructor con = clz.getConstructor(int.class,String.class,String.class);
        User user1 = (User)con.newInstance(2,"lucy","123");
        //获取所有属性
        Field[] fields = clz.getDeclaredFields();
        for (Field field:fields){
            System.out.println(field.getModifiers()+" "+field.getType()+" "+field.getName());
        }
        //修改和获取某个属性的值
        Field field = clz.getDeclaredField("name");
        //获取修改权限
        field.setAccessible(true);
        field.set(user,"tom");
        System.out.println(field.get(user));

        //获取所有方法
        Method[] methods = clz.getDeclaredMethods();
        for (Method method:methods){
            /*System.out.print(method.getModifiers()+" "
                    +method.getReturnType()+" "+method.getName()+"(");
            Class[] p = method.getParameterTypes();
            for (Class temp:p){
                System.out.print(temp+" ");
            }
            System.out.println(")");*/
            System.out.println(method);
        }
        //通过反射调用某个方法
        Method method = clz.getMethod("getName", String.class);
        Object obj = method.invoke(user1,"jack");
        System.out.println(obj);


        //获取所有构造器
        Constructor[] constructors = clz.getDeclaredConstructors();
        for (Constructor constructor:constructors){
            System.out.print(constructor.getModifiers()+" "+constructor.getName()+"(");
           Class[] p = constructor.getParameterTypes();
           for (Class temp:p){
               System.out.print(temp+" ");
           }
            System.out.println(")");
        }
    }
}
