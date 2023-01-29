package crudOpration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class CrudOprationWithJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		

		try
		{

			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjoes","root","123456");
			Statement st=con.createStatement();
			
			ResultSet rs;
			PreparedStatement ps;
			
			String Query="";
			int id,choice,age;
           String name,city;
           
           Scanner sc1=new Scanner(System.in);
           Scanner sc2=new Scanner(System.in);
			while(true)
			{
				System.out.println("MySQL Java CRUD Operation");
				System.out.println("1. Insert");
				System.out.println("2. Update");
				System.out.println("3. Delete");
				System.out.println("4. Select");
				System.out.println("5. Exit");
				System.out.print("Enter a choice: ");
				choice = sc1.nextInt();
				System.out.println("-----------------------------------------");
			
			switch(choice){
			case 1:
				System.out.println("1. Insert New Data");
 
				System.out.println("Enter Name : ");
				name=sc2.nextLine();
				System.out.println("Enter Age : ");
				age=sc1.nextInt();
				System.out.println("Enter City : ");
				city=sc2.nextLine();
 
				Query="insert into users (NAME,AGE,CITY) values(?,?,?)";
				ps= con.prepareStatement(Query);
				ps.setString(1, name);
				ps.setInt(2, age);
				ps.setString(3, city);
 
				ps.executeUpdate();
				System.out.println("Data Insert Success");
 
				break;
			case 2:
				System.out.println("2. Updating a Data");
 
				System.out.println("Enter ID : ");
				id=sc1.nextInt();
				System.out.println("Enter Name : ");
				name=sc2.nextLine();
				System.out.println("Enter Age : ");
				age=sc1.nextInt();
				System.out.println("Enter City : ");
				city=sc2.nextLine();
 //https://iptv-org.github.io/iptv/countries/in.m3u
				//https://freeiptvplayer.com/iptv-player/watch.php
				Query="update users set NAME=?,AGE=?,CITY=? where ID=?";
				ps= con.prepareStatement(Query);
 
				ps.setString(1, name);
				ps.setInt(2, age);
				ps.setString(3, city);
				ps.setInt(4, id);
				
				ps.executeUpdate();
				System.out.println("Data Update Success");
 
				break;
			case 3:
				System.out.println("3. Deleting a Data");
				System.out.println("Enter ID : ");
				id=sc1.nextInt();
 
				Query="delete from users where ID=?";
				ps= con.prepareStatement(Query);
				ps.setInt(1, id);
 
				ps.executeUpdate();
				System.out.println("Data Deleted Success");
 
				break;
			case 4:
				System.out.println("4. Print all Records");
				Query="SELECT ID,NAME,AGE,CITY from users";
				rs=st.executeQuery(Query);
				while(rs.next())
				{
					id=rs.getInt("ID");
					name=rs.getString("NAME");
					age=rs.getInt("AGE");
					city=rs.getString("CITY");
 
					System.out.print(id+" ");
					System.out.print(name+" ");
					System.out.print(age+" ");
					System.out.println(city+" ");
 
				}
				break;
			case 5:
				System.out.println("Thank You");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Selection");
				break;
			}
			System.out.println("-----------------------------------------");
		
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		}
	}