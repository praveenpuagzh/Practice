package org.arraypractice;

public class TwoDimArray {

	public static void main(String[] args) {

		int[][] empid = { { 100, 101, 102 }, { 200, 201, 202 }, { 300, 301 } };

		System.out.println(empid[0][1]);
		System.out.println(empid[2][0]);

		System.out.println("================");

		String[][] fruits = { { "apple", "orange", "banana" }, { "pinaplle", "straberry", "dragon furit" } };

		System.out.println(fruits[1][2]);

		System.out.println("=============");

		for (int i = 0; i < fruits.length; i++) {
			for (int j = 0; j <= fruits.length; j++) {
				System.out.println(fruits[i][j]);
			}
		}
	}

}
