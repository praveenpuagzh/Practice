package org.strings;

public class Countevenorodd {

	public static void main(String[] args) {
		
		int num =1234;
		
		int eve_count=0;
		int odd_count=0;
		
		while (num>0) {
			int rem= num%10;
			if (rem%2==0) {
				eve_count++;
			}
			else {
				odd_count++;
			}
			
			num= num/10;
		}
		System.out.println(eve_count);
		System.out.println(odd_count);
	}
	
	
}
