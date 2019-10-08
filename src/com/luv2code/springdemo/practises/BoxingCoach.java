package com.luv2code.springdemo.practises;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.Coach;

@Component
public class BoxingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practise left and right hook-punches!";
	}

}
