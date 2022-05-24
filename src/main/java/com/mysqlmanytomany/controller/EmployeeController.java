package com.mysqlmanytomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mysqlmanytomany.entity.Employee;
import com.mysqlmanytomany.service.EmployeeService;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
	
	@Autowired
    private EmployeeService employeeService;
    
    @RequestMapping(value = "/saveemployee", method = RequestMethod.POST)
    @ResponseBody
    public Employee saveBook(@RequestBody Employee employee) {
        Employee employeeResponse = employeeService.saveEmployee(employee);
        return employeeResponse;
    }
    

}
