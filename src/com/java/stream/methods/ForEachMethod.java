package com.java.stream.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ForEachMethod {

public static void main(String[] args) {
	//w.a.j.p To perform print operation on each element of reversely sorted stream.
	List<Integer> l1 =Arrays.asList(5,1,9,7,8,3,6,2);
	l1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	System.out.println();
	
	//w.j.p To perform print operation on each element of string stream.
	
	List<String> l2=Arrays.asList("venky","nag","sujiki","madhav","veekshit");
	l2.stream().forEach(a->System.out.println(a));
	System.out.println();
	
	//w.j.p To perform print operation on each element of reversely sorted string stream.
	Stream<String> stream=Stream.of("venky","nag","veekki");
	stream.sorted(Comparator.reverseOrder()).flatMap(str->Stream.of(str.charAt(1))).forEach(System.out::println);
	
}
}
