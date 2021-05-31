package com.vm.training.java.oops;

public class InnerResult {

	private static final String r = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out=new Outer();
		Outer.Inner in=out.new Inner();
		in.display();
		

	}

}
