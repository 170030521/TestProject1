package com.vm.training.java.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class StoredProcedure 
{
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Connection con=DBConnection.getConnection();
			CallableStatement stmt=(CallableStatement) con.prepareCall("{call findAllRecord()}");
			
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}