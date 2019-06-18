package com.xcl.factory;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/17/20:24
 * @description: TODO
 */

public class Factories {
    public static void ServiceCustomer(ServiceFactory factory){
        Service s = factory.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        ServiceCustomer(new GetFirstFactory());
        ServiceCustomer(new GetSecondFactory());
    }
}
