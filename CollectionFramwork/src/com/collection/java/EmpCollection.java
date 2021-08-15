package com.collection.java;

import java.util.ArrayList;

public class EmpCollection {
    public static void main(String[] args)
    {
    	ArrayList<Employee> arrayList =new ArrayList<Employee>();
    	Employee e1 = new Employee("dharmesh","yashTechnologies",23);
    	Employee e2 = new Employee("dharmesh","yashTechnologies",23);
    	Employee e3 = new Employee("dharmesh","yashTechnologies",23);
    	
    	
        arrayList.add(e1);
    	arrayList.add(e2);
    	arrayList.add(e3);
    	System.out.println(arrayList.toString());
    }
}
