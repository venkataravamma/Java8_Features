package com.java.stream.methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AllMatchExample {

	 public static void main(String[] args) {
	//Check if all elements of stream are divisible by 3 or not using Stream allMatch(Predicate predicate)
		 List<Integer> numbers=Arrays.asList(3,6,9,12);
		 boolean numResult = numbers.stream().allMatch(n-> n%3==0);
		 
	// allMatch() function to check whether strings have length greater than 3.
		 List<String> str=Arrays.asList("java","for","dev");
		 boolean strResult =str.stream().allMatch(l -> l.length() >3);
		 
		 
// Check if Character at 1st index is UpperCase in all strings or not using Stream allMatch(Predicate predicate)
		 Stream<String> uppers = Stream.of("Java", "Python", "Sql");   
	     boolean uppResult = uppers.allMatch(st -> Character.isUpperCase(st.charAt(0)));
		 
		 
		 System.out.println("allMatch(): div by 3 : "+ numResult);
		 System.out.println("allMatch(): len gt 3 : "+ strResult);
		 System.out.println("allMatch(): uppercase: "+ uppResult);	
		 
		 
	}
}
