package com.vm.training.java.strings;

public class ThrowsTest {
	void train() throws Exception{
		System.out.println("zero");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsTest th=new ThrowsTest();
		try {
		th.train();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		

	}
}


