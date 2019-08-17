package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String args[]) {
		
		//Initialize the IoC container configuration
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:BeanConfig.xml");
		
		//Get a reference to the bean(using it's id)
		Coach coach = (Coach) context.getBean("myCoach");
		
		//use the bean
		System.out.println(coach.giveMyWorkout());
		System.out.println(coach.howsTheWeather());
		System.out.println(coach.whatsMyFortune());
		System.out.println(coach.gamesPlayed());
		
		Student st =((Student) context.getBean("stud"));
		System.out.println(st.getFirstName());
		System.out.println(st.getLastName());
		System.out.println(st.getRollNo());
		
		Coach coach1 = (Coach) context.getBean("myCoach");
		Coach coach2 = (Coach) context.getBean("myCoach");
		System.out.println(coach1);
		System.out.println(coach2);
		
		((AbstractApplicationContext) context).close();
	}

}
