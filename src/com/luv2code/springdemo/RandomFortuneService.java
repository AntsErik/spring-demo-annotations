package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings
	private String[] randomFortune = {
			"Never give up, never look down!",
			"Life is about the journey that lies ahead!",
			"If you want something, go out and get it!"
	};
	
	//create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		//pick a random string from the array
		int index = myRandom.nextInt(randomFortune.length);
		
		String theFortune = randomFortune[index];
		
		return theFortune;
	}

}
