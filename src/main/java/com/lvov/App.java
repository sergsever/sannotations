package com.lvov;

import com.lvov.beans.BeanUser;
import com.lvov.beans.EmployeeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.PostConstruct;

public class App {
	
	public static void main(String[] args )
	{
		ApplicationContext ctx = new AnnotationConfigApplicationContext("com.lvov");
		System.out.println("spring annotations\n");
		BeanUser user = (BeanUser) ctx.getBean(BeanUser.class);
		System.out.println("name: " + user.getName());
	}
}
