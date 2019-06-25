package com.briup.exception;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/19/14:33
 * @description: TODO
 */

public class OwnExceptionHandler {
    public static void main(String[] args) {
        try {
            OwnExceptionSource.a();
        } catch (OwnException e) {
            System.out.println(e.getMessage());
        }
    }
}
