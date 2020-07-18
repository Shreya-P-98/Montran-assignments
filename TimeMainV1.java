package com.montran.main;

import com.montran.pojo.Time;

public class TimeMainV1 {
	public static void main(String[] args) {

		Time t1 = new Time();
		t1.SetTime(2,60);
		
		Time t2 = new Time();
		t2.SetTime(8,10);
		
		System.out.println("Hours and Minutes of Object t1 : ");
		t1.ShowTime();
		
		System.out.println("Hours and Minutes of Object t2 : ");
		t2.ShowTime();
		
		Time t3 = new Time();
		t3 = t1.sum(t2);
		System.out.print("Hours and Minutes of Object t3 : ");
		t3.ShowTime();
		
	}

}




