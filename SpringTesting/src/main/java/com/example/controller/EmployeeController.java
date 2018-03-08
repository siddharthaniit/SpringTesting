package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;

@Controller
public class EmployeeController {

	/*@RequestMapping(value = "/employee", method = RequestMethod.GET)
	@ResponseBody
	public Employee emp()
	{
		System.out.println("employee");
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("siddu");
		employee.setDesignation("java");
		employee.setSalary(50000);
		return employee;
	}
	*/
	@RequestMapping("/hi")
	public String hi()
	{
		return "welcome";
	}
}
