package com.vm.training.java.oops;

public class InheritanceEx extends Inheritance {
	String email;
	String mobile;
	String address;
	

	public InheritanceEx(int id, String name, String dept, String email, String mobile, String address) {
		super(id, name, dept);
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}
	




	@Override
	public String toString() {
		return "email=" + email + ", mobile=" + mobile + ", address=" + address + ", id=" + id
				+ ", name=" + name + ", dept=" + dept ;
	}














	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceEx e=new InheritanceEx(10,"ggg","kk","email","88938","fvhsdfjhsb");
		System.out.println(e);
		

	}

}
