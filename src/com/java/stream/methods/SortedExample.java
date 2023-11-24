package com.java.stream.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Point {
	Integer x,y;
	public Point(Integer x,Integer y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return this.x +" , "+ this.y;
	}
}
public class SortedExample {
	public static void main(String[] args) {
		List<Point> l1=new ArrayList<>();
		l1.add(new Point(5,100));
		l1.add(new Point(3,900));
		l1.add(new Point(1,200));
		l1.add(new Point(4,700));
		l1.add(new Point(2,400));
		l1.stream().sorted((p1,p2)->p1.x.compareTo(p2.x)).forEach(System.out::println);
		System.out.println();
		//sort by using comparator
		List<Integer> l2= Arrays.asList(-23,8,1,9,-4,7,-3,5,-6,0);
		l2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
