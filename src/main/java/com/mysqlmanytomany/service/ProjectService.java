package com.mysqlmanytomany.service;

import org.springframework.stereotype.Service;

import com.mysqlmanytomany.entity.Employee;
import com.mysqlmanytomany.entity.Project;

@Service
public interface ProjectService {
	
	 public Project findByProjectId(int ProjectId);

}
