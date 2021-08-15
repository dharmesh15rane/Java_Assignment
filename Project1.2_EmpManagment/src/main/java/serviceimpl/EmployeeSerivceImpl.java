package serviceimpl;
import java.util.List;
import java.util.Scanner;

import exception.EmployeeByDepartmentNotFoundException;
import exception.EmployeeByNameNotFoundException;
import exception.EmployeeBySalaryNotFoundException;
import exception.EmployeeIdNotFoundException;
import modal.Employee;
import service.EmployeeService;

/**
 * 
 * @author Dharmesh rane
 *
 */

public class EmployeeSerivceImpl implements EmployeeService 
{
private static List<Employee>empList;
Scanner sc=new Scanner(System.in);

@Override
public void getEmployeeById() throws EmployeeIdNotFoundException {
	System.out.println("Enter the id:");
	long id =sc.nextLong();
	if(empList.stream().anyMatch(e->e.getId()==id))
	{
		empList.stream().filter(e ->e.getId()==id)
		.forEach(System.out::println);
	}
	else
	{
		throw new EmployeeIdNotFoundException("Employee Id Not Found");
	}
}

@Override
public void getEmployeeByName() throws EmployeeByNameNotFoundException {
	System.out.println("Name");
	String name=sc.next();
	if(empList.stream()
			.anyMatch(e->e.getName().equalsIgnoreCase(name)))
			{
		empList.stream()
		.filter(e->e.getName().equalsIgnoreCase(name))
		.forEach(System.out::println);
			}
	else
	{
		throw new EmployeeByNameNotFoundException("Employee Name Not Found");
	}
}

@Override
public void getEmployeeByDepartment() throws EmployeeByDepartmentNotFoundException {
	System.out.println("Enter the Department");
	String department=sc.next();
	if(empList.stream()
			.anyMatch(e->e.getDepartment().equalsIgnoreCase(department)))
			{
		empList.stream()
		.filter(e->e.getDepartment().equalsIgnoreCase(department))
		.forEach(System.out::println);
			}
	else
	{
		throw new EmployeeByDepartmentNotFoundException("Employee Department Not Found");
	}
}

@Override
public void getEmployeeBySalary() throws EmployeeBySalaryNotFoundException {
	
	System.out.println("Salary");
	double salary=sc.nextDouble();
	try {
		if(empList.stream()
				.anyMatch(e->e.getSalary()==salary))
				{
			empList.stream()
			.filter(e-> e.getSalary()==salary)
			.forEach(System.out::println);
				}
		else
		{
			throw new EmployeeBySalaryNotFoundException("Employee Salary Not Found");
		}
	} catch (EmployeeBySalaryNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


@Override
public void getAllDepartment() {
	empList.stream()
	.map(Employee::getDepartment)
	.distinct()
	.forEach(System.out::println);
}


@Override
public void getHighestPaidEmployee() 
{
	empList.stream()
	.max((e1,e2)->e1.getSalary() > e2.getSalary() ? 1:-1)
	.ifPresent(System.out::println);
}

public static void EmpList(List<Employee> initEmpList) {
	// TODO Auto-generated method stub
	
}

}
