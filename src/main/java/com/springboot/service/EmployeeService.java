package com.springboot.service;

import java.util.List;

import com.springboot.model.Employee;

public interface EmployeeService {
	public void  addEmployee(Employee e);
	public List<Employee> getAllEmployee();
	public void deleteEmployee(int id);
    public Employee getEmployeeByID(int id);		
}
