package com.yash.ems.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.yash.ems.dao.EmployeeDao;
import com.yash.ems.model.Employee;
import com.yash.ems.util.HibernateUtil;

/**
 * EmployeeDaoImpl class implements EmployeeDao interface and override its unimplemented methods
 * @author dharmesh
 *
 */
@Repository
@Service
public class EmployeeDaoImpl extends HibernateUtil implements EmployeeDao {

	@Autowired

	private HibernateUtil hiber;

	/**
	 * this method is used to save employee data into database
	 */
	@Override
	public boolean save(Employee employee) {
		try {
			Session session = hiber.getSession();
			Transaction t = session.beginTransaction();
			session.save(employee);
			t.commit();
			session.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * this method is use to fetch the data from data base
	 */
	@Override
	public List<Employee> findAll() {
		Session session = hiber.getSession();
		Transaction t = session.beginTransaction();
		Query q = session.createQuery("from Employee");
		List<Employee> employee = q.list();
		t.commit();
		session.close();
		return employee;

	}

	/**
	 * this method is use to update data in the existing database
	 */
	@Override
	public boolean update(Employee employee) {
		try {
			Session session = hiber.getSession();
			Transaction t = session.beginTransaction();
			session.update(employee);
			t.commit();
			session.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * this method is use to delete data from database
	 */
	@Override
	public boolean delete(int id) {
		try {
			Session session = hiber.getSession();
			Transaction t = session.beginTransaction();
			Employee employee = (Employee) session.get(Employee.class, new Integer(id));
			if (null != employee) {
				session.delete(employee);
				t.commit();
				session.close();
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}
}
