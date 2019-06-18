/**
 * @author xuchunlin
 * @time 2019年6月10日下午5:09:00
 * @version
 * @description TODO
 */
package com.briup.ch05;

public class CheckingAccount extends Account{
	private double overdraft;//透支额度

	public CheckingAccount(double balance) {
		super(balance);
	}
	
	public CheckingAccount(double balance,double overdraft) {
		this(balance);
		this.overdraft = overdraft;
	}
	
	public boolean withdraw(double amount) {
		if (amount>(getBalance()+getOverdraft())) {
			return false;
		}else if (getBalance()>amount) {
			balance -= amount;
			return true;
		}
		else {
			overdraft = (getBalance()+getOverdraft())-amount;
			balance = 0;
			return true;
		}
	}

	public double getOverdraft() {
		return overdraft;
	}

}

