package com.mysqlmanytomany.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysqlmanytomany.entity.Project;
import com.mysqlmanytomany.repository.ProjectRepo;
import com.mysqlmanytomany.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	private ProjectRepo projectRepository;
	
	@Override
	public Project findByProjectId(int projectId) {
			return projectRepository.findByProjectId(projectId);
	} 
	
}
