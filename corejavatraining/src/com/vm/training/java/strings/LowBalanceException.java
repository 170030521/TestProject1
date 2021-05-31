package com.vm.training.java.strings;


		// TODO Auto-generated constructor stub
		public class LowBalanceException extends Exception {
			  
			String message;
			LowBalanceException(String message)
			{
				this.message=message;
			}
			
			public String toString() {
				return message;
			}
		}
