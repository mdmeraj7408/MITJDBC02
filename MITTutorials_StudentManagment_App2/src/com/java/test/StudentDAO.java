package com.java.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {
	//insert data java to database
	public static boolean insertStudentDB(Student st) throws ClassNotFoundException
	{
		boolean f=false;
		try {
			Connection con=CP.creatConnection();
			String q="insert into student(sname,sphone,scity)values(?,?,?)";

			PreparedStatement ps=con.prepareStatement(q);
			//set the values of param
			ps.setString(1,st.getStudentNmae());
			ps.setString(2, st.getStudentPhone());
			ps.setString(3, st.getStudentCity());
			//exequte
			ps.executeLargeUpdate();
			f=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}

	//----------------------------------------------
                  //delete record from database
	public static boolean deleteUser(int id) throws ClassNotFoundException
	{
		boolean f=false;
		try
		{
			String qry="delete from student where sid=? "; 
			Connection con=CP.creatConnection();
			PreparedStatement ps=con.prepareStatement(qry);
			ps.setInt(1, id);
			ps.executeUpdate();
			f=true;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return f;
	}



	//-----------------------------------------------------------------
	             //select record from data
	public static void showAllStudent() throws ClassNotFoundException {
		
		try
		{
			String qry="select*from student"; 
			Connection con=CP.creatConnection();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(qry);
			System.out.println("*****Student Details*******");
			System.out.println("id"+"\t"+"name"+"\t"+"phone"+"\t"+"city");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}

		}catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
}
