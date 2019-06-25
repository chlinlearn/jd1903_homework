package com.briup.exception;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/19/14:19
 * @description: check
 */

public class OwnException extends Exception {
    public OwnException() {
    }

    public OwnException(String message) {
        super(message);
    }

    public OwnException(String message, Throwable cause) {
        super(message, cause);
    }

    public OwnException(Throwable cause) {
        super(cause);
    }
}
