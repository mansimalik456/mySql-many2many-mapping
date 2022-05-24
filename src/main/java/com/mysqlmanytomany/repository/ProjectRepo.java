package com.mysqlmanytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysqlmanytomany.entity.Employee;
import com.mysqlmanytomany.entity.Project;

@Repository
public interface ProjectRepo extends JpaRepository<Project, Integer>{
	
	 public Project findByProjectId(int projectId);
	
}
