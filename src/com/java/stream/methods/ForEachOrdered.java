package com.java.stream.methods;

import java.util.*;
import java.util.stream.Stream;

public class ForEachOrdered {
	public static void main(String[] args) {
		// w.j.p To print the elements of integer array in original order.
		List<Integer> list = Arrays.asList(1, 2, 6, 9, 3, 7, 2);
		list.stream().
		    forEachOrdered(System.out::println);
		System.out.println();
		
		// w.j.p To print the elements of string array in original order.
		List<String> list2 = Arrays.asList("java", "streams", "foreach");
		list2.stream().forEachOrdered(System.out::println);
		System.out.println();
		
		// w.j.p To print the characters at index 2 of string array in original order.
		Stream<String> stream = Stream.of("java", "foreachordered", "method");
		stream.flatMap((str) -> Stream.of(str.charAt(1))).
						forEachOrdered(System.out::println);

	}
}
