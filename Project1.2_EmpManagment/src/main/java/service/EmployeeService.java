package service;

import java.util.ArrayList;
import java.util.List;
import exception.EmployeeByDepartmentNotFoundException;
import exception.EmployeeByNameNotFoundException;
import exception.EmployeeBySalaryNotFoundException;
import exception.EmployeeIdNotFoundException;
import modal.Employee;

/**
 * 
 * @author Dharmesh rane
 *
 */

public interface EmployeeService 
{
public void getEmployeeById() throws EmployeeIdNotFoundException;
public void getEmployeeByName() throws EmployeeByNameNotFoundException; 
public void getEmployeeByDepartment() throws EmployeeByDepartmentNotFoundException;
public void getEmployeeBySalary() throws EmployeeBySalaryNotFoundException;
public void getAllDepartment();
public void getHighestPaidEmployee();


public static List<Employee>initEmpList(ArrayList<Employee> arrayList)
{
		Employee e1=new Employee(1,"Kushagra",12000.0,"Python","Indore",756696637,"IT");
		Employee e2=new Employee(2,"Dharmesh",21000.0,"Mern","Kolkata",644576568,"CS");
		Employee e3=new Employee(3,"Prakhar",14000.00,"Java","Delhi",756442353,"IT");
		Employee e4=new Employee(4,"Sanjay",34000.00,"Java","Ujjain",956345355,"EC");
		Employee e5=new Employee(5,"Mujeeba",12000.00,"Android","Indore",736998988,"CSE");
		Employee e6=new Employee(6,"Shailesh",21000.00,"JavaScript","Mumbai",726998988,"IT");
		Employee e7=new Employee(7,"Madhav",23000.00,"SQL","Indore",745623988,"EC");
		
  arrayList.add(e1);
  arrayList.add(e2);
  arrayList.add(e3);
  arrayList.add(e4);
  arrayList.add(e5);
  arrayList.add(e6);
  arrayList.add(e7);
  return arrayList;


}

}