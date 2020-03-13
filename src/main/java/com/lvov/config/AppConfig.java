package com.lvov.config;

import com.lvov.beans.BeanUser;
import com.lvov.beans.EmployeeBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public EmployeeBean employee(){
		return new EmployeeBean();
	}
//	@Bean
/*	public BeanUser beanuser()
	{
		return new BeanUser();
	}
*/
}
