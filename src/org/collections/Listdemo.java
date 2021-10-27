package org.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Listdemo {

	public static void main(String[] args) {
		
		/*List allow duplicates
		List is index based
		Print in insertion order*/
	    
		

		//ArrayList(best choice when our frequent operation is "retrival")
		List<String> domestic = new ArrayList<String>(Arrays.asList("dog", "cat", "cow", "fish", "hen"));

		System.out.println(domestic.get(0));

		System.out.println("==========");

		for (String p : domestic) {
			System.out.println(p);

		}
		System.out.println("==========");
		
		//Linked List(best choice when frequent option is "insertion" and "deletion")
		List<String> carnivors = new LinkedList<String>(Arrays.asList("lion", "tiger", "fox", "cheeta","lion"));

		for (String q : carnivors) {
			System.out.println(q);
		}
		
		System.out.println("==========");
		boolean contains = carnivors.contains("lion");
		System.out.println(contains);
	
		System.out.println(carnivors.get(2));
	
	}
	

}
