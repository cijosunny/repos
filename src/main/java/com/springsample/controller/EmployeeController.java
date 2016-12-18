package com.springsample.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springsample.service.EmployeeService;
import com.springsample.vo.EmployeeVO;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	static final Logger logger = Logger.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public ModelAndView getAllEmployees(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("employeePage");
		
		mv.addObject("employees", employeeService.getAllEmployees());
		mv.addObject("employee", new EmployeeVO());
		return mv;
	}
	
	@RequestMapping(value="get/{empId}", method=RequestMethod.GET)
	public ModelAndView getEmployee(@PathVariable String empId){
		System.out.println(empId);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("employeeEditPage");
		mv.addObject("employee", employeeService.getEmployee(empId));
		mv.addObject("employees", employeeService.getAllEmployees());
		return mv;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView addEmployee(@ModelAttribute("employee") EmployeeVO employee){
		logger.info(employee);
		System.out.println(employee);
		employeeService.addEmployee(employee);
		return new ModelAndView("redirect:all");
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public ModelAndView updateEmployee(@ModelAttribute("employee") EmployeeVO employee){
		employeeService.updateEmployee(employee);
		return new ModelAndView("redirect:all");
	}
}
