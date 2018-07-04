package com.think.fixBug;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest {

	public static void main(String[] args) {
		List<Long> test = new ArrayList<>();
		test.add(1L);
		test.add(0L);
		test.add(0L);
		test.add(0L);

		List<Long> test2 = test.stream().filter(p -> {
			return p == 0;
		}).collect(Collectors.toList());
		System.out.println(test2);
	}

}
