/**
 * @author xuchunlin
 * @time 2019年6月6日下午2:42:10
 * @version
 * @description TODO
 */
package com.briup.ch05;

public class Duration {
	private int hours;
	private int minutes;
	private int seconds;
	
	public Duration(int hours,int minutes,int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	/**
	 * 
	 * @param seconds 总的秒数
	 */
	public Duration(int seconds) {
		int h = seconds/3600;
		int m = (seconds-h*3600)/60;
		int s = seconds%60;
		this.hours = h;
		this.minutes = m;
		this.seconds = s;
	}
	
	public int getHours() {
		return hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public int getTotalSeconds() {
		return getSeconds();
	}
	public String toString() {
		return "hours:"+hours+"minutes:"+minutes+"seconds:"+seconds;
	}

}

