package sampleprgs;

import java.util.Scanner;

public class ScanSample {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a:");
		int a = sc.nextInt();
		System.out.println("enter b:");
		int b = sc.nextInt();
		int c= a+b;
		System.out.println("total:"+c);
		
	}
}
