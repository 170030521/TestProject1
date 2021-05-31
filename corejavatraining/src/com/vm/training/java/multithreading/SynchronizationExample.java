package com.vm.training.java.multithreading;
class Account 
{
	synchronized public void balance(int n)  ////balance is shared resource
	{
		for(int i=1;i<=n;i++)
			System.out.println(Thread.currentThread().getName()+" is updating  :"+i);
	}
}

class Transaction implements Runnable
{
	Account ac=new Account();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		ac.balance(5);
	}

}

public class SynchronizationExample
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Transaction t=new Transaction();
		Thread thread=new Thread(t);
		Thread thread1=new Thread(t);
		thread.setName("deposit");
		thread1.setName("withdraw");
		thread.start();
		thread1.start();


	}
}
