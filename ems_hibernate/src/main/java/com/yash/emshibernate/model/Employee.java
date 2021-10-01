package com.yash.emshibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Model class employee contains its fields
 * @author Dharmesh
 *
 */
@Entity
@Table(name="Employee_Details")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Employee_Id")
	private long id;

	@Column(name="Employee_Name")
	private String name;

	@Column(name="Designation")
	private String designation;

	@Column(name="Department")
	private String department;

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

	public String getDesignation() {
		return designation;
		/**
		 * return designation of employee
		 */
	}

	public void setDesignation(String designation) {
		this.designation = designation;
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



}
