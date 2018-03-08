package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Employee;

@Controller
@SpringBootApplication
public class SpringTestingApplication {

	@RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	@ResponseBody
	public Employee emp(@RequestBody Employee employee1)
	{
		System.out.println("id");
		Employee employee = new Employee();
        employee.setId(employee1.getId());
		employee.setName(employee1.getName());
		employee.setDesignation(employee1.getDesignation());
		employee.setSalary(employee1.getSalary());
		return employee;
	}
	

	public static void main(String[] args) {
		SpringApplication.run(SpringTestingApplication.class, args);
	}
}
