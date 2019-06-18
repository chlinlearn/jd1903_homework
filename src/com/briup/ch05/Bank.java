/**
 * @author xuchunlin
 * @time 2019年6月10日下午5:15:57
 * @version
 * @description TODO
 */
package com.briup.ch05;

public class Bank {
	private Customer[] customers;//客户
	private int custNum = 0;//客户数量
	private int length = 0;//总长度
	
	public Bank() {
		this(5);
	}
	public Bank(int length) {
		customers = new Customer[length];
		this.length = length;
	}
	
	public void addCustomer(Customer customer) {
		if (customer==null) {
			System.out.println("客户为空");
			return;
		}
		if (custNum>=length) {
			System.out.println("客户已满");
			return;
		}
		customers[custNum] = customer;
		custNum++;
	}
	
	public Customer getCustomer(int index) {
		return customers[index];
	}
	
	public int getCustomerNum() {
		return custNum;
	}
}

