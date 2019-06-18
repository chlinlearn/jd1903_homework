/**
 * @author xuchunlin
 * @time 2019年6月13日下午6:37:48
 * @version
 * @description TODO
 */
package com.briup.ch07;

import java.util.ArrayList;
import java.util.List;

//使用ArrayList存储栈数据
public class MyStack{
	private int size = 0;//长度
	private List list;//存储结构
	
	public MyStack() {
		list = new ArrayList();
	}
	
	//入栈
	public void push(Object obj) {
		if (obj==null) {
			return;
		}
		list.add(obj);
		size++;
	}
	
	//出栈
	public Object pop() {
		//判断栈是否为空
		if (isEmpty()) {
			System.out.println("栈已为空");
			return null;
		}
		Object temp = list.get(size-1);
		list.remove(--size);
		return temp;
	}
	
	//获取栈长度
	public int size() {
		return size;
	}
	
	//移除
	public Object remove(int index) {
		if (index<0||index>=size) {
			return null;
		}
		Object object = list.get(index);
		list.remove(index);
		size--;
		return object;
	}

	//清空栈
	public void removeAll() {
		list.removeAll(list);
		size = 0;
	}
	
	//栈是否为空
	public boolean isEmpty() {
		if (size<=0) {
			return true;
		}
		return false;
	}
	
	//遍历栈
	public void display(List list) {
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i)+" ");
		}
		System.out.println();
	}

}

