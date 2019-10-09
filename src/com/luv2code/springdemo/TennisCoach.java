package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//default scope is singleton
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor.");
	}
	
	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
	}
	
	
	
//	@Autowired
//	public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
//	System.out.println(">> TennisCoach: inside constructor using @Autowired and @Qualifier.");
//		fortuneService = theFortuneService;
//	}
//	
//	//define a setter method
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println(">> TennisCoach: inside setFortuneService() method.");
//		fortuneService = theFortuneService;
//	}
//	
//	//defining my own method
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService theFortuneService) {
//		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method.");
//		fortuneService = theFortuneService;
//	}
	

	@Override
	public String getDailyWorkout() {
		return "Practise backhand volley 30-for-30!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
