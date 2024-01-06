package com.employee.pkg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.employee.pkg.entity.Employee;
import com.employee.pkg.service.EmpService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class EmpController {

	@Autowired
	EmpService empService;

	@GetMapping("/test")
	public String test() {
		log.info("Employye test methed working");
		return "Hi Well Come";
	}

	@PostMapping("/resister")
	public Employee resister(@RequestBody Employee e) {
		log.info("Employye resister methed working");
		log.info("Employye request to resister :"+e);
		Employee e1 = empService.resister(e);
		log.info("Employee ofter complition of serviceimp :"+e1);
		return e1;
	}
}
