package com.lvov.beans;

import org.springframework.beans.factory.annotation.Autowired;


public class BeanUser {
	@Autowired
	protected EmployeeBean employee;
	
	public String getName(){
		return employee.getName();
	}
}
