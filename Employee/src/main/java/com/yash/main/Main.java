package com.yash.main;

import com.yash.dao.EmployeeMapDao;
import com.yash.domain.Employee;

public class Main {

    public static void main(String[] args) {
	
    	Employee emp = new Employee();
    	emp.setId("emp23");
    	//emp.getId();
    	EmployeeMapDao.addEmployeeToMap(emp);
    	emp.setName("Rane");
    //	emp.getName();
    	emp.setSalary(23456.09);
    //.getSalary();
    	emp.setDesignation("Manager");
    //	emp.getDesignation();
    	emp.setDepartment("Devloper");
    	emp.getDepartment();
    	EmployeeMapDao.displayEmployeeMap();
    }
}
