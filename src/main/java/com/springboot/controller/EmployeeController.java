package com.springboot.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.springboot.model.Employee;
import com.springboot.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	@GetMapping(value="/add_employee")
public ModelAndView addEmployeeHandler() {
		ModelAndView m=new ModelAndView();
		m.addObject("title", "add_employee");
		m.setViewName("add_employee");
		
	return m;
}
	@GetMapping("/")
	public  ModelAndView getAllEmployeeHandler() {
			ModelAndView m=new ModelAndView();
			m.addObject("title", "home_employee");
			List<Employee> empList=employeeServiceImpl.getAllEmployee();
			m.addObject("employeeList", empList);
			m.setViewName("form");
		return m;
	}
	@PostMapping(value="adding")
	public RedirectView addingHandler(@ModelAttribute() Employee e,HttpServletRequest request) {
		RedirectView rd=new RedirectView();
		employeeServiceImpl.addEmployee(e);
		//String str=request.getContextPath()+"/";
		//rd.setUrl(request.getContextPath()+"/");
		rd.setUrl(request.getContextPath()+"/");
		return rd;
		}
	@GetMapping("/delete_employee/{id}")
	public  RedirectView deleteEmployeeHandler(@PathVariable("id") int id,HttpServletRequest request,Model m) {
			RedirectView r=new RedirectView();
			employeeServiceImpl.deleteEmployee(id);
			m.addAttribute("title", "delete_employee");
			r.setUrl(request.getContextPath()+"/");
		return r;
	}
	@GetMapping("/edit_employee/{id}")
	public  ModelAndView updateEmployeeHandler(@PathVariable("id") int id) {
			ModelAndView m=new ModelAndView();
			Employee e=employeeServiceImpl.getEmployeeByID(id);
			m.addObject("emp", e);
			m.addObject("title", "edit_employee");
			m.setViewName("edit");
		return m;
	}
}
