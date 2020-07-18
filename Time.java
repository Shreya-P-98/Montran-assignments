package com.montran.pojo;

public class Time {
	private int hours;
	private int minutes;

	public void SetTime(int hours,int minutes) {
		this.hours= hours;
		this.minutes= minutes;
	}

	public void ShowTime() {
		System.out.println( hours + " Hours  and  " +  minutes + " Minutes ");	
	}

	public Time sum(Time time) {

		Time t =new Time();

		t.hours = this.hours + time.hours;
		t.minutes = this.minutes + time.minutes;

		if(t.minutes>=60)
		{
			t.hours=t.hours+1;
			t.minutes= t.minutes + 60;
		}
		return t;
	}
	
	
	
}
