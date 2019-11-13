package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class UwrCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Dive deep, score high!";
	}

}
