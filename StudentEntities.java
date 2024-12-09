package com.databasemanagament.studentmanagment.entity;

public class StudentEntities 
{
	private String studentName ;
	private int stdId ;
	private int StdAge;
	private String StdAddress;
	
	/*-------------------------Parameterised constructor--------------------------------*/
	public StudentEntities(int stdId, String stdName, int StdAge, String StdAddress) 
	{
		super();
		this.stdId = stdId;
		this.studentName = stdName;
		this.StdAge = StdAge;
		this.StdAddress = StdAddress;
	}
	/*-----------------------------------------------------------------*/
	public StudentEntities() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	/*------------------------------Getter and Setter-----------------------------------*/
	public int getStdId() {return stdId;}
	public void setStdId(int stdId) {this.stdId = stdId;}
	
	public String getStdName() {return studentName;}
	public void setStdName(String stdName) {this.studentName = stdName;}
		
	public int getAge() {return StdAge;}
	public void setAge(int age) {this.StdAge = age;}
	
	public String getAddress() {return StdAddress;}
	public void setAddress(String address) {this.StdAddress = address;}
	/*------------------------------To override and convert all data into strings-----------------------------------*/
	@Override
	public String toString() 
	{
		return "StudentEntities [stdId=" + stdId + ", stdName=" + studentName
				+ ", age=" + StdAge + ", address=" + StdAddress + "]";
	}		
}
