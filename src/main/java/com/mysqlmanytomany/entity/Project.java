package com.mysqlmanytomany.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "projects")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Project {
	
	 @Id
	 @Column(name = "project_id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int projectId;

	 @Column(name = "title")
	 private String title;

	 @ManyToMany(fetch = FetchType.LAZY,mappedBy = "projects", cascade = { CascadeType.ALL })
	 private Set<Employee> employees = new HashSet<Employee>();    
	      

}
