package com.vm.training.java.oops;

public class CustomerGetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cus=new Customer();
		cus.setId(101);
		cus.setFirstName("kakumanu");
		cus.setLastName("geetha");
		cus.setAccount("savings");
		System.out.println(cus.getId());
		System.out.println(cus.getFirstName());
		System.out.println(cus.getLastName());
		System.out.println(cus.getAccount());
		

	}

}
