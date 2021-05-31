package com.vm.training.java.time;

import java.time.LocalDate;

public class DateCaluculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today=LocalDate.now();
		System.out.println(today);
		System.out.println(today.plusDays(1));
		System.out.println(today.plusWeeks(2));
		System.out.println(today.plusMonths(1));
		System.out.println(today.plusYears(1));
		LocalDate bookingdate=LocalDate.of(2021,  05, 27);
		if(bookingdate.isAfter(today))
			System.out.println("correct");
		else
			System.out.println("invalid");
		
		

	}

}
