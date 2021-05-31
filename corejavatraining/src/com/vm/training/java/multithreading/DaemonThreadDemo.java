package com.vm.training.java.multithreading;

class Company  extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("name "+Thread.currentThread().getName());
		}
	}
}
class Employee1  extends Thread
{
	public void run()
	{
		for(int i=1;i<50;i++)
		{
			System.out.println("name "+Thread.currentThread().getName()+i);
		}
	}
}

public class DaemonThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company co=new Company();
		Employee1 em=new Employee1();
		co.setName("geetha");
		em.setName("pahnai");
		co.start();
		em.start();
		co.setDaemon(true);

	}

}
