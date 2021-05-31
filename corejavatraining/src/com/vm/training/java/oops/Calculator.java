package com.vm.training.java.oops;

public class Calculator {
	
		  int num1,num2,num3,num4;
		  double sum=0;
		  double f;
		  long l;

		  /*public Calculator(int num1, int num2, int num3, int num4, int sum) {
		    
		    this.num1 = num1;
		    this.num2 = num2;
		    this.num3 = num3;
		    this.num4 = num4;
		    this.sum = sum;
		  }*/



		  



		void  add(int num1,int num2) {
		    l = num1 + num2;
		    System.out.println(l);

		  }

		  double add(int num1,double f) {
		    sum = num1 + f;
		    return sum;

		  }
		  long add(int num1,int num2,int num3,int num4) {
		    l= num1 + num2 + num3;
		    return l;
		  }
	}


		  


