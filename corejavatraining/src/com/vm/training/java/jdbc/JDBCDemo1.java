package com.vm.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		try {
			//step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded");

			//step 2
		Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/compact?autoReconnect=true&useSSL=false\r\n"
					+ "","root","admin");
			System.out.println("Connected");
			Statement stmt=con.createStatement();
			stmt.execute("insert into student values(1,'god',101,'python')");
			System.out.println("inserted");
			stmt.execute("create table teacher(id int,name varchar(30),subject varchar(30))");
			
			



		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}


	}

	private static Connection createStatement() {
		// TODO Auto-generated method stub
		return null;
	}
}
