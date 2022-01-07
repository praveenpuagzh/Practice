package org.strings;

public class Swap2Numbers {

	
	public static void main(String[] args) {
		
		
		int a= 10,b=20;
		
		System.out.println("before swap:"+a+" "+b);
		/*logic 1
		int t=a;
		a=b;
		b=t;*/
		
		//logic 2 without using new vaarble
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("after swap:"+a+" "+b);
	}
}
