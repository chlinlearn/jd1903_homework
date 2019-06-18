/**
 * @author xuchunlin
 * @time 2019年6月11日下午3:35:52
 * @version
 * @description TODO
 */
package com.briup.ch05;

//我的答案：2,6,5,1,4,3,9,8,7
//正确答案：1,2,6,5,4,3,9,8,7
public class ZhiXingShunXu {
	public static void main(String[] args) {
		System.out.println("1");
		new D();
	}
}

class C {
	static {
		System.out.println("2");
	}

	C() {
		System.out.println("3");
	}

	{
		System.out.println("4");
	}
}

class D extends C {
	public String sd1 = getSd1();

	static public String getSd() {
		System.out.println("5");
		return "sd";
	}

	static {
		System.out.println("6");
	}
	public static String sd = getSd();

	D() {
		System.out.println("7");
	}

	{
		System.out.println("8");
	}

	public String getSd1() {
		System.out.println("9");
		return "sd1";
	}
}
