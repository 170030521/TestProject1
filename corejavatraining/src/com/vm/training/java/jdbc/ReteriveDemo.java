package com.vm.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class ReteriveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded");

			//step 2
		Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/compact?autoReconnect=true&useSSL=false\r\n"
					+ "","root","admin");
			System.out.println("Connected");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from emp");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}

	}


