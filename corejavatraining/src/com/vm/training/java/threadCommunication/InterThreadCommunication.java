package com.vm.training.java.threadCommunication;

public class InterThreadCommunication {
	public static void main(String[] args)
	{
		Customer cus=new Customer();
		Thread t1=new Thread()
				{
			public void run()
			{
				System.out.println(cus.withdraw(2000));
			}
				};
				Thread t2=new Thread()
				{
			public void run()
			{
				System.out.println(cus.deposit(4000));
			}
				};
				t1.setName("withdraw");
				t2.setName("deposite");
				t1.start();
				t2.start();
	}

}
