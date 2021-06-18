package com.vm.entity;

public class Hello {
	
	
		private String Fname;
		private String Lname;
		public String getFname() {
			return Fname;
		}
		public void setFname(String fname) {
			Fname = fname;
		}
		public String getLname() {
			return Lname;
		}
		public void setLname(String lname) {
			Lname = lname;
		}
		
		public void display()
		{
			System.out.println("Fname:"+ Fname);
			System.out.println("Lname:"+ Lname);
			
		}

		
}
