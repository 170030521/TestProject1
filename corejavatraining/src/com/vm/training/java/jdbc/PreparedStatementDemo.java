package com.vm.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded");

			//step 2
		Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/compact?autoReconnect=true&useSSL=false\r\n"
					+ "","root","admin");
			System.out.println("Connected");
			/*PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?)");
			ps.setInt(1, 8);
			ps.setString(2, "vasantha");
			ps.setString(3, "1998-09-08");
			ps.execute();
			System.out.println("inserted");*/
			int id=1;
			PreparedStatement ps=con.prepareStatement("select * from emp where id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
	}
		catch(Exception e) {
System.out.println(e);
}
	}

}