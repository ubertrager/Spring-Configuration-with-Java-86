package com.luv2code.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring contain
		Coach theCoach = context.getBean("uwrCoach", Coach.class);
		
		// call a method on the bean	
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}
