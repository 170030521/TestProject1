package com.vm.training.java.strings;

public class ExceededDays extends Exception {
	String message;
	ExceededDays(String message)
	{
		this.message=message;
	}
	
	public String toString() {
		return message;
	}
}
