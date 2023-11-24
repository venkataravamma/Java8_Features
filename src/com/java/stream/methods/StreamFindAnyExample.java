package com.java.stream.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindAnyExample {
	
	public static void main(String[] args) {
		List<String> str=Arrays.asList("Avocado","Banana","Orange","Apple");
		//Optional<String> result=str.stream().filter(s->s.startsWith("A")).findAny();
		Optional<String> result=str.stream().filter(s->s.startsWith("A")).findFirst();
		if (result.isPresent()) {
			System.out.println("Found string starting with 'A': " + result.get());
		}else {
			System.out.println("No string starting with 'A' found.");
		}
	}

}
