package org.strings;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

	int num = sc.nextInt(); //1234
	//using string buffer
	/*StringBuffer sb = new StringBuffer(String.valueOf(num));
	StringBuffer rev = sb.reverse();
	System.out.println(rev);*/
	
	//using string builder
	StringBuilder sbl = new StringBuilder();
	sbl.append(num);
	StringBuilder rev = sbl.reverse();
	System.out.println(rev);
	}
	
	
}
