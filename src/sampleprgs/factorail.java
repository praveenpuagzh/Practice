package sampleprgs;

import java.util.Scanner;

public class factorail {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		int factor = 1;
		
		for (int i=1; i <= num; i++)
		{
			factor = factor*i;
		}
		
		System.out.println("factorial:"+factor);
	}
	
}
