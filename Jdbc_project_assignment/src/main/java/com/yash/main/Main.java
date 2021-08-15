package com.yash.main;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import com.mysql.jdbc.Connection;


public class Main {
              static Logger logger =Logger.getAnonymousLogger();
              
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_project","root","root");
       // System.out.println("Database Connected");
		
        logger.info("Database Connected");
//        try {
//        String sql ="Insert into Car(reg_id,honor_name,car_type) Values(4,'Kern','BMW')";
//        String sql1= "Insert into eingen(eng_id,eng_detail,eng_model) Values(101,'4xsports','2000-08-12')";
//        Statement st =(Statement) con.createStatement();
// 		int i = st.executeUpdate(sql);
// 		int j = st.executeUpdate(sql1);
// 		//System.out.println(i+"inserted");
// 		logger.info(i+"inserted");
// 		logger.info(j+"inserted");
//        }
//        
//        catch(Exception e)
//        {
//        	//System.out.println("Please enter the valid Car type");
//        	logger.info("Please enter the valid Car type");
//        }
        
//        

        
        String q="insert into Car(reg_id,honor_name,car_type) values(?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(q); 
        pstmt.setInt(1,4);
        pstmt.setString(2, "Dharmesh");
        pstmt.setString(3, "Maruti");
        pstmt.executeUpdate();
        logger.info("inserted");
        
        
        con.close();
	}

}
