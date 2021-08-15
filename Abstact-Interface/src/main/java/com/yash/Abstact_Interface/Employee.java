package com.yash.Abstact_Interface;

public abstract class Employee 
{
   void getCompanyName()
   {
	   System.out.println("yash technology");
   }
    
   Employee()
   {
	   System.out.println("Emp Default Constructor");
   }
 
    final static String address = "Indore";
   
   abstract void getId();
   abstract void getSal();
   abstract void getDesg();
  
   
}
