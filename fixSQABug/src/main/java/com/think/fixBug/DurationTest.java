package com.think.fixBug;

import java.time.Duration;

public class DurationTest {

	public static void main(String[] args) {
		Duration maxTime = Duration.ofSeconds(120);
		Duration desiredTime = Duration.ofSeconds(60);
		Duration test = Duration.ofSeconds(120);
		System.out.println(maxTime.minus(test).isNegative());

	}

}
