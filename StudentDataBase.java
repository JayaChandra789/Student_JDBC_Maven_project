package com.databasemanagament.studentmanagment;
import java.sql.*;

public class StudentDataBase 
{
	public static void main(String[] args)
	{
		try
		{
			//Register mySQL driver	
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Establishing connection with DataBase
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","Jaya@123");
			//To Create a statement
			Statement stmObj = conObj.createStatement(); //c small S caps
			//Execute syntax for queries
		/*	stmObj.execute("create table student(studentName varchar(30) primary key,stdId int(30) not null,"
					+ "stdAge int(20),StdAddress varchar(50) not null)"); //Always remember syntax closing brackets */
			//To Execute insert query
			int i = stmObj.executeUpdate("insert into student values('Jaya','185','22','HYD')");
			/*----------------------- Closing connection here. ---------------------------*/
			conObj.close();
			//Checking data inserted or not
			if(i>0)
			{
				System.out.println("Data Inserted.");
			}
			else
			{
				System.out.println("Unable to insert data.");
			}                                                                   
			System.out.println("Table Successfully created: ");
			//Create program should be maintain separate or comment it once after executing it.
		}
		// try ends here... 
		//catch begins here...
		catch(ClassNotFoundException catchobj1)
		{
			System.out.println(catchobj1);
		}
		catch(SQLException catchobj3)
		{
			System.out.println(catchobj3);
		}
	}
}
