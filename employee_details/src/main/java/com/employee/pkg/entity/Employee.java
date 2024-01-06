package com.employee.pkg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;
	private String empLastName;
	private String empAge;
	private String empDateOfBirth;
	private String empPhNo;
	private String empWork;
	private String empDate;
	private String empTime;
	
}
