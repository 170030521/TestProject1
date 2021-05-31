package com.vm.training.java.oops;

public class GrandFather {
	int age;
	public  GrandFather(int age) {
	  this.age=age;
	}  
	  void walk() {
	    System.out.println("i can't able to walk:"+age);
	  }
	}


	class Father extends  GrandFather{
	  int myage;
	  public  Father(int age,int myage) {
	    super(age);
	    this.myage=myage;
	  }  
	    void walk() {
	      System.out.println("i can able to walk fast:"+myage);
	    }
	  }

	class Son extends  Father{
	  int myteenage;
	  public  Son(int age,int myage,int myteenage) {
	    super(age,myage);
	    this.myteenage=myteenage;
	  }  
	    void walk() {
	      System.out.println("i can run fast:"+myteenage);
	    }
}
