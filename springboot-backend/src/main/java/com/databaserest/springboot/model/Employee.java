package com.databaserest.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data	//lombok for getters and setters
@Entity //JPA annotation specifies class is an entity
@Table(name = "employees")  //specifies table in the database with which entity is mapped
public class Employee {
	
	@Id		//annotation specifies primary key of entity
	@GeneratedValue(strategy = GenerationType.IDENTITY) //specifies generation strategies for the values of primary keys
	private long id;
	
	@Column(name = "fName", nullable = false)
	private String fName;
	
	@Column(name = "lName")
	private String lName;
	
	@Column(name = "email")
	private String email;
}
