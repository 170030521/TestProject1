package com.vm.training.java.oops;

public class Inheritance {
	int id;
	String name;
	String dept;
	public Inheritance(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public String toString() {
		return id+""+name+"" +dept;
		
	}
	public static void main(String[] args)
	{
		Inheritance in= new Inheritance(10,"hhh","jjj");
		
	System.out.println(in);
		
		
	}

}
