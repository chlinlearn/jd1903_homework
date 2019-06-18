package com.briup.ch07;
/* *
 *@author:xuchunlin
 *@createTime:2019/6/17/10:38
 */

public interface Iterator<T> {
    boolean hasNext();
    T next();
    T remove();
}
