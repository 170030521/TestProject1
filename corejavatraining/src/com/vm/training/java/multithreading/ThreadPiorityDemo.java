package com.vm.training.java.multithreading;

public class ThreadPiorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Geetha ge1=new Geetha();
		Geeth ph1=new Geeth();
		System.out.println(ge1.getPriority());
		System.out.println(ph1.getPriority());
		ge1.setName("geetha");
		ph1.setName("phani");
		ge1.setPriority(8);
		ph1.setPriority(2);
		ge1.start();
		ph1.start();
		

	}

}
