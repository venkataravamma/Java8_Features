package com.java.stream.methods;

import java.util.stream.Stream;

public class StreamOf {
	public static void main(String[] args) {
		// Java code for Stream of(T t) to get a sequential Stream containing a single
		// element.
		Stream<String> stream = Stream.of("java");
		stream.forEach(System.out::println);
		System.out.println();
		// Java code for Stream of(T... values) to get a sequential ordered stream whose
		// elements are the specified values.

		Stream<String> stream1 = Stream.of("Geeks", "for", "Geeks");

		// Displaying the sequential ordered stream
		stream1.forEach(System.out::println);
		System.out.println();
	}

}
