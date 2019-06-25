package com.briup.exception;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/19/14:37
 * @description: TODO
 */

public class DivisionByZero {
    public static void division() throws OwnException {
        try {
            int k = 10/0;
        }catch (ArithmeticException e){
            throw new OwnException("除数不能为0");
        }
    }

    public static void main(String[] args) {
        try {
            division();
        } catch (OwnException e) {
            System.out.println(e.getMessage());
        }
    }
}
