package com.luv2code.practises;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;

@Component
public class BoxingCoach implements PractiseCoach {

	@Value("${foo.email}")
	private String email;
	    
	@Value("${foo.team}")
	private String team;
	
	@Autowired
	private PractiseFortuneService practiseFortuneService;
	
	// define a default constructor
	public BoxingCoach() {
		System.out.println(">> BoxingCoach: inside default constructor.");
	}	
	
	@Override
	public String getDailyWorkout() {
		System.out.println(">> BoxingCoach: inside getDailyWorkout method.");
		return "Practise left and right hook-punches!";
	}

	@Override
	public String getDailyFortune() {
		System.out.println(">> BoxingCoach: inside getDailyFortune method.");
		return practiseFortuneService.getFortune();
	}

	@Override
	public String getEmail() {
		System.out.println(">> BoxingCoach: inside getEmail getter.");
		return email;
	}

	@Override
	public String getTeam() {
		System.out.println(">> BoxingCoach: inside getTeam getter.");
		return team;
	}
	
	

}
