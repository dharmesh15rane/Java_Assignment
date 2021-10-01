package com.yash.ems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.DynamicUpdate;

/**
 * Model class employee contains its attribues, parametirized constructor, getter and setter
 * methods and toString method 
 * @author Dharmesh
 *
 */
@Entity
@Table(name = "Empl") 
@DynamicUpdate
public class Employee 
{

	/**
	 * ID of Employee which is autogenerated
	 */
	@Id
	@GeneratedValue
	@Column(name="Employee ID")
	private long id;
	
	/**
	 * Name of employee
	 */
	@Column(name="Employee Name")
	@Size(min=2, max=50)
	@NotEmpty
	private String name;
	
	/**
	 * Salary of employee
	 */
	@Column(name="Employee Salary")
	private double salary;
	
	/**
	 * Department of employee
	 */
	@Column(name="Employee Department")
	@NotEmpty
	private String department;
	
	/**
	 * Designation of Employee
	 */
	@Column(name="Employee Designation")
	@NotEmpty
	private String designation;
	
	/**
	 * Address of employee
	 */
	@Column(name="Employee Address")
	@NotEmpty
	private String address;

	/**
	 * default Constructor for employee
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Parametrized Constructor for employee
	 * @param id
	 * @param name
	 * @param salary
	 * @param department
	 * @param designation
	 * @param address
	 */
	public Employee(long id, String name, double salary, String department, String designation, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.designation = designation;
		this.address = address;
	}

	/**
	 * getter and setter methods for employee attributes
	 * @return
	 */
	public long getId() {
		return id;
		/**
		 * return id of employee
		 */
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
		/**
		 * return name of employee
		 */
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
		/**
		 * return salary of employee
		 */
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
		/**
		 * return department of employee
		 */
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
		/**
		 * return designation of employee
		 */
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAddress() {
		return address;
		/**
		 * return address of employee
		 */
	}

	public void setAddress(String address){
		this.address = address;
	}

	/**
	 * toString method for employee
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ ", designation=" + designation + ", address=" + address + "]";
	}
	


}
