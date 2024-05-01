package com.jsp.example.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.example.entity.Employee;
import com.jsp.example.repository.EmployeeRepository;
import com.jsp.example.service.EmployeeService;



@Controller
public class HomeController {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	EmployeeService employeeService;
	
	private Object employee;
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	/*
	 * @GetMapping("/emp") private void listUser() { List < Employee > employee =
	 * employeeService.getAllEmployees(); request.setAttribute("Employee",
	 * employee); RequestDispatcher dispatcher =
	 * request.getRequestDispatcher("listemployee.jsp"); dispatcher.forward(request,
	 * response); }
	 */
	
	
	/*
	 * @GetMapping("/books") public String addBook(Model
	 * model, @RequestParam(required = false) String name) { if (name != null)
	 * employeeService.saveEmployee(new Employee());
	 * model.addAttribute("employee",employee); return "listemployee"; }
	 */ 
	
	@RequestMapping("/new")
	public ModelAndView getform()
	{
			return new ModelAndView("stuform","list",new Employee());
		
	}
	  
	  @RequestMapping(value = "/emp", method = RequestMethod.GET)
	  public   ModelAndView empLoad(Model model)
	  {
	  List<Employee> driverDetails = new ArrayList<Employee>(); 
	  driverDetails = (List<Employee>) employeeRepository.findAll();
	  model.addAttribute("driverDetails",driverDetails);
	  ModelAndView viewObj = new ModelAndView("listemployees");
	  return viewObj;
	  }
		@RequestMapping("liste/{id}")
		public String confirmdel(@PathVariable Long id)
		{
			return "redirect:/emp";
		}
		@RequestMapping("delstu/{id}")
		public String deletestudent(@PathVariable Long id)
		{
			employeeService.deleteEmployee(id);
			return "redirect:/emp";
		}
		@RequestMapping("stu/{id}")
		public ModelAndView editstudent(@PathVariable Long id)
		{
			 return new ModelAndView("editstu","student",employeeService.getEmployeeById(id));
			
		}
		@RequestMapping("/updatestu")
		public String updatestudent(@ModelAttribute Employee stu)
		{
			employeeService.updateEmployee(stu);
			return "redirect:/emp";
			
		}
		@RequestMapping(value="/processform2", method = RequestMethod.POST)
		public ModelAndView getstudent2(@ModelAttribute Employee emp)
		{
			employeeService.saveEmployee(emp);
			return new ModelAndView("listemployees","stu",emp);
		}
		
	
	  @GetMapping("/") 
	  public ModelAndView getemployee() throws ClassNotFoundException { 
		  return new  
//jsp table name , var_name jo foreach m use hoga,service method jha se data jayega
	  ModelAndView("listemployees","list",employeeService.getAllEmployees()); }
	 	
}
