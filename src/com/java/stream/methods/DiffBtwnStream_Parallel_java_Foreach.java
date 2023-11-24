package com.java.stream.methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DiffBtwnStream_Parallel_java_Foreach {
	public static void main(String[] args) {

		/*
		 * java for each 
		 * 1.Lambda operators is not used 
		 * 2.Can be used to access arrays
		 * and collections 
		 * 3.The return or control statements work within the loop
		 * 4.No multithreading thus slow data is in sequence
		 */
		String[] arr = { "1", "2", "3" };
		int count = 0;
		String[] arr1 = { "java", "foreach", "ok" };
		for (String a : arr) {
			System.out.println(arr1[count++]);
		}
		System.out.println();

		/*
		 * Stream foreach()
		 * 1.Lambda operators is used 
		 * 2.Can only be used to access collections 
		 * 3.The return or control statements don't work within the loop
		 * 4.No multithreading thus slow data is in sequence
		 */

		Stream<Integer> stream1 = Stream.of(1, 7, 8, 9, 2);
		count = 0;
		stream1.forEach((str) -> {
			// this will cause an error
			// note :: count++;

			// print all elements
			System.out.print(str);

		});
		System.out.println();

		// stream can not be used with arrays

		// note :: arr1.stream() .forEach(s -> { System.out.print(s); }); }

		System.out.println();

		/*
		 * parallelStream foreach() 
		 * 1.Lambda operators is used 
		 * 2.Can only be used to access collections
		 * 3.The return or control statements don't work within the loop 
		 * 4.It is multithreaded thus very fast and sequence is different
		 */

		List<Integer> l1 = Arrays.asList(1, 7, 8, 9, 3);
		l1.parallelStream().forEach(s -> {
			System.out.print(s);
		});
	}
}
