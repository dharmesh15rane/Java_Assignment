package com.yash.main;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Dealer {
	  static Logger logger =Logger.getAnonymousLogger();
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dealer_infornation","root","root");	
        logger.info("Databases connected");
       
        
            //shop_table
//        String q ="insert into Shop(shop_name,owner_name) values(?,?)";
//        PreparedStatement pstmt = con.prepareStatement(q);
//        pstmt.setString(1, "Krish_Dairy");
//        pstmt.setString(2, "Rane");
//        pstmt.executeUpdate();
        
          ///product_table
//        String q1="insert into Product(product_name,product_price) values(?,?)";
//        PreparedStatement pstmt2 = con.prepareStatement(q1);
//        pstmt2.setString(1, "Milk");
//        pstmt2.setInt(2, 30);
//        pstmt2.executeUpdate();
//        logger.info("Inserted in Product Table ");
//        con.close();
        
        String q2="SELECT s.reg_id,s.shop_name,s.owner_name,p.product_name,p.product_price  FROM shop s INNER JOIN product p ON s.proid = p.product_id";
        Statement st =(Statement) con.createStatement();
        ResultSet rs =  st.executeQuery(q2);
		while( rs.next())
		{
			System.out.println("Employee data is "+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		}
        
        
        
	}

}
