package com.briup.exception;

public class TestException {
	public static void main(String[] args) {
        try {
            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args[2]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("参数个数不正确");
        }
    }
}
