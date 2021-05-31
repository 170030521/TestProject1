package com.vm.training.java.oops;

public class TestAssociation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show();
		composition();
			
		}
	static void show() {
		Address addres=new Address();
		addres.setCountry("ddsdsf");
		addres.setState("ddsdsf");
		addres.setCity("ddsdsf");
		
		Emp emp=new Emp(); 
			emp.setId(100);
			emp.setName("ddsdsf");
			emp.setAddress(addres);
			System.out.println(emp);
			System.out.println("fdfg");			
		
		
	}
	static void composition() {
		Address addres=new Address();
		addres.setCountry("ddsdsf");
		addres.setState("ddsdsf");
		addres.setCity("ddsdsf");
		
		Person per=new Person();
			per.setId(100);
			per.setName("ddsdsf");
			per.setAddress(addres);
			System.out.println(per);
			System.out.println("fdfg");
			per=null;
			System.out.println(per);
			System.out.println(addres);
			
	}
	
	}
	

	


