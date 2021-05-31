package com.vm.training.java.multithreading;
class ProjectCall  extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("name "+Thread.currentThread().getName());
		}
	}
}
class WorkingOnProject  extends Thread
{
	public void run()
	{
		for(int i=6;i<7;i++)
		{
			System.out.println("name "+Thread.currentThread().getName());
		}
	}
}


public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ProjectCall pc=new ProjectCall();
		WorkingOnProject wop=new WorkingOnProject();
		pc.setName("hfbsdfj");
		wop.setName("sdjhkjfjnkjjk");
		pc.start();
		pc.join();
		wop.start();
		wop.start();
		

	}

}
