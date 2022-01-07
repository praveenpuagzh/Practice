package org.strings;

public class Sample {


	
	public static void main(String[] args) {
		
		String str = "Sony";
		System.out.println("orginal sting:" + str);

		StringBuffer reversstr = new StringBuffer(str);
		System.out.println("reverse str:" + reversstr.reverse().toString());
		
	
	}

}
