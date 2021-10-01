package com.yash.ems.web;

import java.util.*;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yash.ems.dao.EmployeeDao;

import com.yash.ems.model.Employee;
import com.yash.ems.service.EmployeeService;

/**
 * Employee controller to perform all operation through request mapping
 * @author madhav.machiwal
 *
 */
@Controller
@RequestMapping(value="/")
public class EmployeeController 
{
	
	@Autowired
	private EmployeeService empser;
	
	@Autowired
	private EmployeeDao employeedao;
	/**
	 * this request mapping is for the getting list from table
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public String getList(ModelMap model) 
	{
		List<Employee> emplist = employeedao.findAll();
		model.addAttribute("emplist", emplist);
		return "empllist";
	}

	/**
	 * this method for the register the new employee
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/save",method = RequestMethod.GET)
	public String newRegistration(ModelMap model) 
	{
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "enroll";
	}

	/**
	 * This method is use to save details in database
	 */

	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String saveRegistration(@Valid Employee employee,BindingResult result, ModelMap model)
	{
		if (result.hasErrors()) 
		{
			return "enroll";
		}

		employeedao.save(employee);

		model.addAttribute("success", "Dear " + employee.getName() + " , your registration completed successfully");
		return "success";
	}

	/**
	 * Method is use to intialize department list
	 * @return
	 */
	@ModelAttribute("department")
	public List<String> initializeDepartments()
	{
		List<String> department = new ArrayList<String>();
		department.add("IT");
		department.add("Testing");
		department.add("Research");
		department.add("HR");
		department.add("Finance");
		return department;
	}
	
	/**
	 * this method is use to initialize country list
	 * @return
	 */
	@ModelAttribute("countries")
	public List<String> initializeCountries()
	{
		List<String> countries = new ArrayList<String>();
		countries.add("INDIA");
		countries.add("USA");
		countries.add("UAE");
		countries.add("GERMANY");
		countries.add("ITALY");
		countries.add("OTHER");
		return countries;
	}

	/**
	 * this request mpping to delete records from database 
	 */
	@RequestMapping(value = "/delete",method = RequestMethod.GET)
	public String deletepage(ModelMap model) 
	{
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "delete";
	}

	@RequestMapping(value = "/delete",method = RequestMethod.POST)
	public String deleteEmp(Employee employee,BindingResult result, ModelMap model)
	{
		int empid = (int) employee.getId();
		employeedao.delete(empid);

		model.addAttribute("success", " Record has been deleted successfully");
		return "successupdation";
	}
	
	/**
	 * this request mapping is for update employee
	 */
	@RequestMapping(value = "/update",method = RequestMethod.GET)
	public String newRegistration1(ModelMap model) 
	{
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "updateform";
	}


	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public String saveRegistration(Employee employee, ModelMap model)
	{
		employeedao.update(employee);

		model.addAttribute("success", "Dear " + employee.getName() + " , your record updated successfully");
		return "successupdation";
	}

	/**
	 * this method is use to search employee records by id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/searchbyid", method = RequestMethod.GET)
	public String searchpage(ModelMap model) 
	{
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "searchbyid";
	}


	@RequestMapping(value="/searchbyid", method = RequestMethod.POST)
	public String searchEmp(Employee employee,BindingResult result, ModelMap model)
	{
		int empid = (int) employee.getId();
		boolean e = empser.getEmployeeById(empid);
		model.addAttribute("employee", e);
		model.addAttribute("success", "Record found !!!");
		return "success";


	}
	
	@ModelAttribute("department")
	public List<String> initializeDepartments1()
	{
		List<String> department = new ArrayList<String>();
		department.add("IT");
		department.add("Testing");
		department.add("Research");
		department.add("HR");
		department.add("Finance");
		return department;
	}

	@ModelAttribute("countries")
	public List<String> initializeCountries1()
	{
		List<String> countries = new ArrayList<String>();
		countries.add("INDIA");
		countries.add("USA");
		countries.add("UAE");
		countries.add("GERMANY");
		countries.add("ITALY");
		countries.add("OTHER");
		return countries;
	}



}
