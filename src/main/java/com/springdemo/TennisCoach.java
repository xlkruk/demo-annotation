package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.*;

@Component
public class TennisCoach implements Coach {

	@Value("${name}")
	private String name;
	@Value("${test.email}")
	private String email;
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	/*
	 * public TennisCoach(FortuneService fortune) { this.fortuneService=fortune;
	 * }
	 */

	public TennisCoach() {
		System.out.println("w konstruktorze TennisCoach()");
		
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley!";
	}

	@PostConstruct
	public void doSomething() {
		System.out.println("w metodzie doSomething()");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("w metodzie doMyCleanupStuff()");
	}

	@Override
	public String getDailyFortune() {
		System.out.println("name: "+name+" email: "+email);
		return fortuneService.getFortune();
	}

}
