package com.yash.Jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DatabaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	   
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","root");
        System.out.println("Database Connected");
        Statement st =(Statement) con.createStatement();
		ResultSet rs =  st.executeQuery("select * from emp");
		while( rs.next())
		{
			System.out.println("Employee data is "+rs.getString(1)+""+rs.getString(2)+""+rs.getString(3));
		}
		
	}

}
