package org.condistatments;

public class logicaland {

	public static void main(String[] args) {

		int age = 24;
		int weight = 51;

		if (age >= 20 && weight >= 50) { // If both operands are true then only "logical AND operator" evaluate true.
			System.out.println("Eligibel to donate blood");
		}

		else {
			System.out.println("not eligible");
		}

	}

}
