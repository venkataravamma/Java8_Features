package com.java.stream.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyVsFindFirst {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(3, 1, 4, 1, 5, 9, 7,8,2, 6, 5);
		
		//Using findAny()
		Optional<Integer> anyMatch=numbers.parallelStream().filter(n -> n>5).findAny();
		
		
		//Using findFirst()
		Optional<Integer> firstMatch = numbers.parallelStream().filter(n -> n>5).findFirst();
		
		System.out.println("findAny(): " + anyMatch.orElse(null));
        System.out.println("findFirst(): " + firstMatch.orElse(null));
		
	}

}
