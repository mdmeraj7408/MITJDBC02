package com.java.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection con;
      public static Connection creatConnection() throws ClassNotFoundException
      {
    	  try {
    		  //step 1: load the driver
    		  Class.forName("com.mysql.jdbc.Driver");
    		  //create the connection
    		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","123456");
		} catch (Exception e) {
			
		}
		return con;
      }
}
