package com.vm.training.java.strings;

public class CheckedExceptionIdentity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(4/0);
			int[] i= {1,2};
			System.out.println(i[2]);
			
			
			
			}catch(Exception e)
		{
				System.out.println(e);
				e.printStackTrace();
		}

	}

}
