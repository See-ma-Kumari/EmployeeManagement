package com.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Employee;
@Repository
public interface EmployeeDaoRepository extends JpaRepository<Employee, Integer>{
	

}
