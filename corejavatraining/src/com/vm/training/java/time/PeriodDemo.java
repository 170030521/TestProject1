package com.vm.training.java.time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PeriodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today=LocalDate.now();
		Scanner sc=new Scanner(System.in);
		
       System.out.println("Enter your dob");
       String dob=sc.nextLine();
       DateTimeFormatter dtf=DateTimeFormatter.ofPattern("YYYY/MM/DD");
       LocalDate ld=LocalDate.parse(dob);
       Period period=Period.between(ld, today);
       System.out.println("year :"+period.getYears() +" month: "+period.getMonths() +"day :"+period.getDays());
       
	}

}
