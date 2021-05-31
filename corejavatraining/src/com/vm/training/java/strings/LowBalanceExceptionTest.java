package com.vm.training.java.strings;

public class LowBalanceExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance=900;
		try {
			if(balance<100)
			{
				throw new LowBalanceException("your balance is less than 1000");
			}
		}
			catch(LowBalanceException e)
			{
				e.printStackTrace();
			}

	}

}
