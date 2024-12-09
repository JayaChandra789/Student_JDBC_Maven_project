package com.databasemanagament.studentmanagment.utility;
import java.sql.*;

public class StudentUtility 
{
	private static Connection connectionObj = null;
	static
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			/*--------------------------------------------*/
			/*Creating variables*/
			String url = "jdbc:mysql://localhost:3306/mydatabase";
			String username = "root";
			String password = "Jaya@123";
			/*---------------------------------------------------*/
			/*---------------Create connection----------------------------*/
			connectionObj = DriverManager.getConnection(url, username, password);
		}
		catch(ClassNotFoundException cnfeObj)
		{
			System.out.println("Driver not found");
		}
		catch(SQLException SQLExObj)
		{
			System.out.println(SQLExObj);
		}
	}
	/*--------------------------------------------------------------------*/
	/*-------------------------Method to return connection---------------------------*/
	public static Connection getConnection()
	{
		return connectionObj;
	}
	/*-----------------Method to close connection--------------------*/
	public static void closeConnection()
	{
		try
		{
			if(connectionObj != null)
			{
				connectionObj.close();
			}
		}
		catch(SQLException SQLObj)
		{
			System.out.println(SQLObj);
		}
	}
}
