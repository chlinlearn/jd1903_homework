package com.briup.exception;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/19/14:26
 * @description: TODO
 */

public class OwnExceptionSource{
    public static void a() throws OwnException {
            throw new OwnException("异常抛出....");
    };
}
