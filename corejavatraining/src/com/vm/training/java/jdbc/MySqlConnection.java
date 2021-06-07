package com.vm.training.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MySqlConnection {

	public static void main(String[] args) {
		try {
			Connection con=DBConnection.getConnection();
			System.out.println("Connected");
			System.out.println("please enter the option");
			System.out.println("1.add employee");
			System.out.println("2.display");
			System.out.println("3.display employee by id");
			Scanner sc=new Scanner(System.in);
			int number = sc.nextInt();
			//PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?)");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee");
			switch(number) {
			case 1:
				Employee employee=new Employee();
				employee.setEmpid(sc.nextInt());
				employee.setEmpname(sc.next());
				employee.setLob(sc.next());
				employee.setSalary(sc.nextInt());
				employee.setAge(sc.nextInt());
				EmployeeDAO.addEmployee(employee);
				System.out.println("Employee details added successfully");

			case 2:
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5)); 
				}


			case 3:
				int id1=sc.nextInt();
				PreparedStatement ps1=con.prepareStatement("select * from employee where empid=?");
				ps1.setInt(1, id1);
				ResultSet rs1=ps1.executeQuery();
				while(rs1.next()) {
					System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getString(3)+" "+rs1.getInt(4)+" "+rs1
							.getInt(5)); 
									}

			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}