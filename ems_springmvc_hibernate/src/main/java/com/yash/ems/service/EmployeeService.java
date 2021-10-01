package com.yash.ems.service;


import com.yash.ems.model.Employee;

/**
 * EmployeeService interface contains method to search employee records by their id
 * @author Dharmesh
 *
 */
public interface EmployeeService {

	/**
	 * this getid method is use to getting employee records by id
	 */
	public boolean getEmployeeById(int empid);

}
