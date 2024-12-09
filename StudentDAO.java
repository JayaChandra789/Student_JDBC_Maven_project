package com.databasemanagament.studentmanagment.dao;

import java.sql.*;

import com.databasemanagament.studentmanagment.entity.StudentEntities; /*Mandate to import package of entities or were you stored values in entity program as it is encapsulated / private*/

public class StudentDAO 
{
	public int insertStudent(Connection conObj, StudentEntities studentObj) 
	{
		int rows = 0;
		try 
		{
			if (conObj != null) 
			{
				/*----Creating PreparedStatement---*/
				PreparedStatement stmtObj = conObj.prepareStatement("insert into values(?,?,?,?)");
				/*------------------------------------------------------------------------------*/
				/*-----Setting data into prepared statement------*/
				stmtObj.setString(1, studentObj.getStdName());
				stmtObj.setInt(2, studentObj.getAge());
				stmtObj.setInt(3, studentObj.getStdId());
				stmtObj.setString(4, studentObj.getAddress());

				/*----------------------------------------------------------*/
				/*--------To execute query-------*/
				rows = stmtObj.executeUpdate();
				return rows;
			} 
			else 
			{
				return rows;
			}
		} 
		catch (SQLException SQLObj) 
		{
			System.out.println(SQLObj);
			return rows;
		}
	}
}
