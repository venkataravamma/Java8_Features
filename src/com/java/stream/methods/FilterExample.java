package com.java.stream.methods;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		//Filtering out the elements divisible by some specific number ranging between 0 to 10.
		 List<Integer> l1=Arrays.asList(9,5,2,6,1,8,3,7);
		 l1.stream().filter(n->n%3==0).forEach(System.out::println);
		 System.out.println();
		 
		 //filter() method with the operation of filtering out the elements with an upperCase letter at last index.
		 List<String> s1= Arrays.asList("javA","phP","sqL","python","sprinG");
		 s1.stream().filter(s-> Character.isUpperCase(s.charAt(s.length()-1))).forEach(System.out::println);
		 System.out.println();
	}
 
	
}
