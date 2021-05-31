package com.vm.training.java.strings;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class TryWithResourceTest {

	public static void main(String[] args) {
		try(FileOutputStream fos=new FileOutputStream(new File(""));
				Connection con=DriverManager.getConnection("url","un","pwd")){
		
		
				String s="Valuemomentum";
				byte[] by=s.getBytes();
				fos.write(by);
				
				
				
		// TODO Auto-generated method stub

	}


