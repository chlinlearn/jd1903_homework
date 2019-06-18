package com.xcl.factory;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/17/20:23
 * @description: TODO
 */

public class GetFirstFactory implements ServiceFactory{
    @Override
    public Service getService() {
        return new FirstFactory();
    }
}
