package com.mysqlmanytomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mysqlmanytomany.entity.Employee;
import com.mysqlmanytomany.entity.Project;
import com.mysqlmanytomany.repository.ProjectRepo;
import com.mysqlmanytomany.service.EmployeeService;
import com.mysqlmanytomany.service.ProjectService;

@RestController
@RequestMapping(value = "/project")
public class ProjectController {
	
	@Autowired
	private ProjectRepo projectRepository;
	 
	 @ResponseBody
	 @RequestMapping(value = "/projects")
	 public List<Project> getProjectDetails() {
		 List<Project> projectresponse = (List<Project>) projectRepository.findAll();
	     return projectresponse;
	 }
	
	@Autowired
    private ProjectService projectService;
   
	@RequestMapping(value = "/{projectId}", method = RequestMethod.GET)
    @ResponseBody
    public Project getProjectDetails(@PathVariable int projectId) {
    	System.out.println(projectId);
    	Project projectResponse = projectService.findByProjectId(projectId);
    	System.out.println(projectResponse);
    	return projectResponse; 
    } 
    
}
