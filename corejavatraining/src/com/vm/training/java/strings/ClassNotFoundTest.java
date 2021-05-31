package com.vm.training.java.strings;

public class ClassNotFoundTest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			Class.forName("rr");
			System.out.println("ffdv");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

}
