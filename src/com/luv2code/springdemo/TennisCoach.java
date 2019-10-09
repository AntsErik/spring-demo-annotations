package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor.");
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
