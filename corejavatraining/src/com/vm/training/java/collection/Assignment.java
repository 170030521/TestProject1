package com.vm.training.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList javabatch=new ArrayList();
		javabatch.add("ravi");	
		javabatch.add("john");
		javabatch.add("anil");
		javabatch.add("kumar");
		ArrayList sqlbatch=new ArrayList();
		sqlbatch.add("sourab");	
		sqlbatch.add("ankita");
		sqlbatch.add("john");
		sqlbatch.add("kumar");
		sqlbatch.add("manoj");
		javabatch.removeAll(sqlbatch);
		
		javabatch.addAll(sqlbatch);
		System.out.println(javabatch);
		System.out.println(sqlbatch);
		Collections.sort(javabatch);
		System.out.println(javabatch);
		

	}

}
