package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UwrCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public UwrCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Dive deep, score high!";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
