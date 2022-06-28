package com.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.EmployeeDaoRepository;
import com.springboot.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDaoRepository employeeDaoRepository;

	@Override
	public void addEmployee(Employee e) {
		employeeDaoRepository.save(e);
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> empList=employeeDaoRepository.findAll();
		return empList;
	}

	@Override
	public void deleteEmployee(int id) {
		employeeDaoRepository.deleteById(id);
	}

	@Override
	public Employee getEmployeeByID(int id) {
		Employee e=employeeDaoRepository.getById(id);
		return e;
	}

	
}
