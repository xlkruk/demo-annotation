package com.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Toda is a sad day";
	}

}
