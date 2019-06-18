package com.briup.ch05;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] s = { new Shape(1, 4), new Rectangle(1, 2, 3, 4), 
				new Circle(2, 3, 5)};
		for (int k = 0; k < s.length; k++) {
			s[k].draw();
		}

	}

}

//上面就是测试的代码，理解继承的关系，想一想：为什么数组的类型是shape？