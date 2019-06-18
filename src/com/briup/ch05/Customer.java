/**
 * @author xuchunlin
 * @time 2019年6月10日下午5:14:00
 * @version
 * @description TODO
 */
package com.briup.ch05;

public class Customer {
	private Account account;//账户
	private String name;//姓名
	
	public Customer(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

}

