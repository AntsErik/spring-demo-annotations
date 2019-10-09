package com.luv2code.practises;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;

public class PractiseAnnotationDemoApp {

	public static void main(String[] args) {

		//read spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContextForPractise.xml");
		
		//get the bean from spring container
		PractiseCoach theCoach = context.getBean("boxingCoach", PractiseCoach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call a method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//call getters for coach email and team name
		System.out.println("email: " + theCoach.getEmail());
		System.out.println("team: " + theCoach.getTeam());
		
		//close the context
		context.close();

	}
}
