package com.vm.training.java.threadCommunication;

public class Customer {
	int balance=5000;
	
	
	synchronized public int withdraw(int amount)
	{
		
		if(balance<amount)
		{
			System.out.println("no suufficient balance");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println(Thread.currentThread().getName() +"is gng to withdraw");
		balance =balance- amount;
		
		return balance;
	}
	synchronized public int deposit(int amount)
	{
		System.out.println(Thread.currentThread().getName() +"is gng to draw");
		balance=balance+amount;
		return balance;
	}
	

}
