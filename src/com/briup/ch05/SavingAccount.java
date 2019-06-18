/**
 * @author xuchunlin
 * @time 2019年6月10日下午5:05:58
 * @version
 * @description TODO
 */
package com.briup.ch05;

public class SavingAccount extends Account{
	private double rate;//利率

	public SavingAccount(double balance,double rate) {
		super(balance);
		this.rate = rate;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

}

