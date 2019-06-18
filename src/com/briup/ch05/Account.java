/**
 * @author xuchunlin
 * @time 2019年6月6日下午3:50:11
 * @version
 * @description TODO
 */
package com.briup.ch05;

public class Account {
	protected double balance;//余额
	
	public Account(double balance) {
		this.balance = balance;
	}

	/**
	  *  存钱
	 * @param amount 金额
	 * @return true or false
	 */
	public boolean deposit(double amount) {
		return true;
	}
	
	/**
	  *    取钱
	 * @param amount 金额
	 * @return true or false
	 */
	public boolean withdraw(double amount) {
		if (amount>balance) {
			return false;
		}else {
			balance -= amount;
			return true;
		}		
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}

}

