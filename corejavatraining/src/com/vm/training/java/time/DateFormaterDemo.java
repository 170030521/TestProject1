package com.vm.training.java.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormaterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today=LocalDate.now();
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("YYYY/MM/DD");
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("YYYY MM DD");
		
		DateTimeFormatter dtfull=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter dtm=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter dts=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		
		String afterformat=today.format(dtf);
		System.out.println(afterformat);
		String afterformat1=today.format(dtf1);
		System.out.println(afterformat1);
		String fd=today.format(dtfull);
		System.out.println(fd);
		String md=today.format(dtm);
		System.out.println(md);
		String sd=today.format(dts);
		System.out.println(sd);
		
		

	}

}
