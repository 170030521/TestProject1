package com.vm.training.java.strings;

public class ProductException extends Exception {
	String message;
	ProductException(String message)
	{
		this.message=message;
	}
	
	public String toString() {
		return message;
	}

}
