package com.vm.training.java.time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {

	public static void main(String[] args) {
		LocalDate todaydate=LocalDate.now();
		System.out.println(todaydate);
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println(datetime);
		System.out.println(todaydate.getDayOfYear());
		System.out.println(todaydate.getDayOfMonth());
		System.out.println(todaydate.getDayOfWeek());
		
		
		// TODO Auto-generated method stub

	}

}
