package com.lvov.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanUser {
	@Autowired
	protected EmployeeBean employee;
	
	public String getName(){
		return employee.getName();
	}
}
