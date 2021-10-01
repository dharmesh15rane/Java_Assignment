package com.yash.ems.serviceimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.yash.ems.model.Employee;
import com.yash.ems.service.EmployeeService;
import com.yash.ems.util.HibernateUtil;

/**
 * EmployeeServiceImpl class implements EmployeeService Interface and override its unimplemented 
 * methods
 * @author Dharmesh
 *
 */
public class EmployeeServiceImpl extends HibernateUtil implements EmployeeService 
{

	@Autowired
	private HibernateUtil hiber;

	/**
	 * this method is use to search employee by their id
	 */
	@Override
	public boolean getEmployeeById(int empid) {
		// TODO Auto-generated method stub
		try {
			Session session = hiber.getSession();
			Transaction t = session.beginTransaction();
			Employee emp = session.get(Employee.class, new Integer(empid));
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

}
