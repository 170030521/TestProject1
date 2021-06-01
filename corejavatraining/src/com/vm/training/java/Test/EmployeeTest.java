package com.vm.training.java.Test;

import java.security.cert.CRLException;
import java.util.Scanner;

public class EmployeeTest {

	

		public static void main(String[] args) throws CRLException {
			// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.print("enter firstname : ");
	    String firstname=sc.next();
	    System.out.print("enter lastname : ");
	    String lastname=sc.next();
			
			Employee emp=new Employee(firstname,lastname);
			
			try {
				emp.Validation();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	
	}


