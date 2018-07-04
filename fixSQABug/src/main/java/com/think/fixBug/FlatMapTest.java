package com.think.fixBug;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapTest {

	public static void main(String[] args) {

		Map<String, List<Integer>> map = new LinkedHashMap<>();
		map.put("a", Arrays.asList(1, 2, 3));
		map.put("b", Arrays.asList(4, 5, 6));

		System.out.println(map);

		List<Integer> list3 = map.values().stream().flatMap(p -> p.stream()).collect(Collectors.toList());

		System.out.println(list3);


	}

}
