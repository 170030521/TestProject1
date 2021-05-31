package com.vm.training.java.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TicketBooking {

	public static void main(String[] args) {
		  LocalDate today=LocalDate.now();
		  Scanner sc=new Scanner(System.in);
		
		  String str=sc.nextLine();
		  System.out.println("Enter the date to be booked in format(yyyy-mm-dd)");
		  
		  LocalDate ld=LocalDate.parse(str);
		  if(ld.isAfter(today))
		  {
		   System.out.println("The ticket is booked successfully on "+ld);
		  }
		  else
		  {
		   System.out.println("We can not book your ticket");
		  }
		 }
		}
