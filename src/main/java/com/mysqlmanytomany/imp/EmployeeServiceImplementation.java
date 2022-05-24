package com.mysqlmanytomany.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysqlmanytomany.entity.Employee;
import com.mysqlmanytomany.repository.EmployeeRepo;
import com.mysqlmanytomany.service.EmployeeService;

@Service
public class EmployeeServiceImplementation implements EmployeeService{

	@Autowired
	private EmployeeRepo employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
}
