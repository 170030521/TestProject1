package com.vm.training.java.multithreading;
class Employee extends Thread
{
	public void run()
	{
		System.out.println("task of emp");
	}
}
class Student implements Runnable
{
	public void run() {
		System.out.println("kjfkfj");
	}
}

public class CreateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Employee emp=new Employee();
  emp.start();
  Student stu=new Student();
  Thread t1=new Thread(stu);
  t1.start();
	}

}
