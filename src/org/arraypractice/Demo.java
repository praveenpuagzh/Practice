package org.arraypractice;

public class Demo {

	public static void main(String[] args) {

		// Datatype[] Arrayname = {data,data};

		int[] tens = { 10, 20, 30, 40, 50 }; // integer Array initialization

		System.out.println(tens[1]);

		String[] fruits = { "apple", "banana", "grapes", "mango" }; // String array initialization

		System.out.println(fruits[3]);

		System.out.println("=============");

		// Array iteration using for each
		for (String p : fruits) {
			System.out.println(p);
		}

		System.out.println("=============");

		for (Integer q : tens) {
			System.out.println(q);
		}

	}
}
