package com.vm.training.java.multithreading;
class Geetha extends Thread{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
		   try {
			sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("geetha "+i);
		}
	}
}
class Geeth extends Thread{
	public void run()
	{
		for(int i=11;i<=20;i++)
		{
			System.out.println("geeth "+i);
		}
	}
}
class Geet extends Thread{
	public void run()
	{
		for(int i=21;i<=30;i++)
		{
			System.out.println("geet "+i);
		}
	}
}

public class MultiTaskingDemo {
	public static void main(String[] args)
	{
		Geetha ge=new Geetha();
		Geeth geeth=new Geeth();
		Geet geet=new Geet();
		/*ge.run();
		geeth.run();
		geet.run();*/
		ge.start();
		geeth.start();
		geet.start();
		System.out.println("name "+Thread.currentThread().getName());
	}

}
