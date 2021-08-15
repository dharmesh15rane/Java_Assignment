package com.collection.java;
public class Employee {
      
	String name ,cmpname;
	int age;

	Employee(String name,String cmpname,int age)
	{
		super();
		this.name =name;
		this.cmpname= cmpname;
		this.age =age;
	}
	public String toString()
	{
		return name+" "+ cmpname+" "+age;
	}
	
}


