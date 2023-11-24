package com.java.stream.methods;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {
	public static void main(String[] args) {
		//anyMatch() function to check whether any element in list satisfy given condition.
		List<Integer> numbers=Arrays.asList(2,3,6,7,1,8,9,4);
		boolean result =numbers.stream().anyMatch(n->(n*(n+1)/4==5));
		System.out.println(result);
		
		//anyMatch() function to check whether any element in list having UpperCase at 1st index.
		List<String> str=Arrays.asList("Venky","nAg","veeki");
		boolean result2 =str.stream().anyMatch(s-> Character.isUpperCase(s.charAt(1)));
		System.out.println(result2);
	}

}
