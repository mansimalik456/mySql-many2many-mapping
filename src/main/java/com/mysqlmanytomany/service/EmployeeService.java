package com.mysqlmanytomany.service;

import org.springframework.stereotype.Service;

import com.mysqlmanytomany.entity.Employee;

@Service
public interface EmployeeService {
	
	 public Employee saveEmployee(Employee employee);

}
