package com.yash1.Inheritance1;

public class Employee extends Person {

	 int income;
	 int startYear;
	 String nationalInsuranceNumber;
	 
	 Employee(String emp_Name, int income,int startYear,String nationalInsuranceNumber )
	 {
	      super(emp_Name);
	      this.income =income;
	      this.startYear =startYear;
	      this.nationalInsuranceNumber =nationalInsuranceNumber;
	 }
	
	 public void showData()
	 {
		 System.out.println(income);
		 System.out.println(startYear);
		 System.out.println( nationalInsuranceNumber);
		 System.out.println(emp_Name);
	 }
}
