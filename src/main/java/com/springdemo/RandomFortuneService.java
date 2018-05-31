package com.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = { "test 1", "test 2", "test 3", "test 4" };

	private Random random = new Random();

	@Override
	public String getFortune() {

		int index = random.nextInt(data.length);
		return data[index];
	}

}
