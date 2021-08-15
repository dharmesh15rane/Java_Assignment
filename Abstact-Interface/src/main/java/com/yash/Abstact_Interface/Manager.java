package com.yash.Abstact_Interface;

public class Manager extends Employee {

	  int man_id =121;
	  int man_salary =24244;
	  String desig ="IRM";
	@Override
	void getId() {
	System.out.println(man_id);
		
	}

	@Override
	void getSal() {
		System.out.println(man_salary);
		
	}

	@Override
	void getDesg() {
		System.out.println(desig);
	}
         
	
}
