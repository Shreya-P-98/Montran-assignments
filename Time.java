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

		Time t4 =new Time();

		t4.hours = this.hours + time.hours;
		t4.minutes = this.minutes + time.minutes;

		if(t4.minutes>=60)
		{
			t4.hours=t.hours+1;
			t4.minutes= t4.minutes + 60;
		}
		return t4;
	}
	
	
	
}
