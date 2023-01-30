
package com.java.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JdbcTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{             System.out.println("Welcome to Student Managment App");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	while(true)
	{
		System.out.println("----------------------------");
		System.out.println("----------------------------");
		System.out.println("Press 1 to Add student");
		System.out.println("----------------------------");
		System.out.println("Press 2 to Delete student");
		System.out.println("----------------------------");
		System.out.println("press 3 to display student");
		System.out.println("----------------------------");
		System.out.println("Press 4 to exits app");
		System.out.println("----------------------------");
		int c=Integer.parseInt(br.readLine());

		//-------------------------------------------------------------
		if(c==1)
		{
			System.out.println("----------------------------");
			System.out.println("----------------------------");
			//add student
			System.out.println("Enter User Name:");
			String name=br.readLine();
			System.out.println("Enter User Phone:");
			String phone=br.readLine();
			System.out.println("Enter User City:");
			String city=br.readLine();
			Student st=new Student(name, phone, city);
			boolean f1= StudentDAO.insertStudentDB(st);
			System.out.println(st);
			if(f1)
			{
				System.out.println("records added successfully....");
			}else
			{
				System.out.println("something went wrong...");
			}
			//------------------------------------------------------------------
		}else if(c==2)
		{
			//delete student
			System.out.println("Enter user id:");
			int id=Integer.parseInt(br.readLine());

			boolean f=StudentDAO.deleteUser(id);
			if(f)
			{
				System.out.println("record successfully deleted");
			}else
			{
				System.out.println("sorry wrong id..try next time");
			}
			//--------------------------------------------------------------------
		}else if(c==3)
		{
			//display student

			StudentDAO.showAllStudent();
			//--------------------------------------------------------------------
		}else if(c==4)
		{
			//exit
			break;
			//--------------------------------------------------------------------
		}else
		{

		}
	}
	System.out.println("Thank you for using my app");
	System.out.println("See You Soon ..by by");
	}

}
