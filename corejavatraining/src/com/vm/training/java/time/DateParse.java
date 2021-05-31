package com.vm.training.java.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sd="2021-05-25";
		LocalDate id=LocalDate.parse(sd);
		System.out.println(id);
		String bd="2021/may/25";
		
		String fd=sd.formatted(dtfull);
		System.out.println(fd);
		

	}

}
