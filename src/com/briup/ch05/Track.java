/**
 * @author xuchunlin
 * @time 2019年6月6日下午2:57:08
 * @version
 * @description TODO
 */
package com.briup.ch05;

public class Track {
	private String title;
	private Duration duration;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	public Duration getDuration() {
		return duration;
	}
	public String toString() {
		return "my Track title is: " + title 
				+ " duration is: " + duration.getTotalSeconds();
	}
}

