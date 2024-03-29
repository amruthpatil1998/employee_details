package com.employee.pkg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.pkg.entity.Employee;
import com.employee.pkg.repository.EmpRepository;
import com.employee.pkg.util.EmpUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	EmpUtil empUtil;

	@Autowired
	EmpUtil util;
	
	@Autowired
	EmpRepository repo;
	
	@Override
	public Employee resister(Employee e) {
		log.info("Employee resistation is send to the validation");
		boolean Empvld = empUtil.validate(e);
		if(Empvld==true) {
			log.info("Employee resistration is done");
		}
		else {
			log.info("Employee resistration is not done");
		}
		
		String date = util.setDate();
		log.info("Employee Date Genarated :"+date);
		e.setEmpDate(date);
		
		String time = util.setTime();
		log.info("Employee Time Genarated :"+time);
		e.setEmpTime(time);
		
		log.info("Employee Date save to the repository to db");
		Employee EmployeeDetiles = repo.save(e);
		
		return EmployeeDetiles;
	}

}
