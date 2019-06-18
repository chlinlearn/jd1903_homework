/**
 * @author xuchunlin
 * @time 2019年6月13日下午6:37:56
 * @version
 * @description TODO
 */
package com.briup.ch07;

import java.util.ArrayList;
import java.util.List;

//使用ArrayList存储队列数据
public class MyQueue {
	private int size = 0;
	private List list;
	
	public MyQueue() {
		list = new ArrayList();
	}
	
	//入队
	public void in(Object obj) {
		if (obj==null) {
			return;
		}
		list.add(obj);
		size++;
	}
	
	//出队
	public Object out() {
		if (isEmpty()) {
			System.out.println("队列已空");
			return null;
		}
		Object obj = list.get(0);
		list.remove(0);
		size--;
		return obj;
	}
	
	//插队
	public void add(int index,Object obj) {
		if (index<0||index>=size) {
			return;
		}
		if (obj==null) {
			return;
		}
		list.add(index, obj);
		size++;
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
	
	//清空
	public void removeAll() {
		list.removeAll(list);
		size = 0;
	}
	
	//是否队列为空
	public boolean isEmpty() {
		if (size<=0) {
			return true;
		}
		return false;
	}
	
	//获取队长
	public int size() {
		return size;
	}
	
	//遍历队列
	public void display(List list) {
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i)+" ");
		}
		System.out.println();
	}
}

