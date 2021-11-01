package org.condistatments;

public class logicalor {
	
	/*The logical OR operator is only evaluated as true 
	when one of its operands evaluates true. 
	If either or both expressions evaluate to true, 
	then the result is true.*/
	
	
	public static void main(String[] args) {

		int age = 19;
		int weight = 51;

		if (age >= 20 || weight >= 50) { 
			System.out.println("Eligibel to donate blood");
		}

		else {
			System.out.println("not eligible");
		}

	}
}
