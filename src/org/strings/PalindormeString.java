package org.strings;

import java.util.Scanner;

public class PalindormeString {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text");
		String str = sc.next();
		String org_str =str;
		StringBuffer sb = new StringBuffer(str);
		String reverse = sb.reverse().toString();
		
		if (org_str.equals(reverse)) {
			System.out.println("palindorme");
		}else {
			System.out.println("not palindorm");
		}
		


}

}