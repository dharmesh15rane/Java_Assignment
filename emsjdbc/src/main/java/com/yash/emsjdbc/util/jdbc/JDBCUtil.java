package com.yash.emsjdbc.util.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUtil 
{
		public static Connection psDemo() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");
			System.out.println("db connected");
			return conn;
			
		}

//		public static PreparedStatement prepareStatement(String sql) {
//			// TODO Auto-generated method stub
//			return null;
//		}

	
		
	
}



//try
//{
//	Class.forName("com.mysql.jdbc.Driver");
//	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");
//	PreparedStatement ps = con.prepareStatement(sql);
//	System.out.println("Database Connection");
//}
//catch(Exception e)
//{
//	e.printStackTrace();
//}
//
//return null