package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingListElementsUsingStreamFilter {
	
	public static void main (String [] args) {
	
		List <Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		
		System.out.println("List = "+ list);
	
		list.stream().filter(n -> !n.equals(3)).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("List = "+ list);
	}

}
