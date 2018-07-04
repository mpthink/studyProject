package com.think.fixBug;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class TestTime {

	public static void main(String[] args) throws InterruptedException {

		LocalDateTime time;

		List<LocalDateTime> testList = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			Date date = new Date();
			ZoneId zoneId = ZoneId.systemDefault();
			time = LocalDateTime.ofInstant(date.toInstant(), zoneId);
			Thread.sleep(1000);
			testList.add(time);
			System.out.println("time " + i + ":  " + time);
		}

		testList.stream().forEach(t -> {
			System.out.println(t);
		});

		Optional<LocalDateTime> minTime = testList.stream().min(LocalDateTime::compareTo);

		System.out.println("minTime :  " + minTime);

		LocalDateTime temp = minTime.get().plus(6000, ChronoUnit.MILLIS);

		System.out.println("minTime :  " + temp);
	}

}
