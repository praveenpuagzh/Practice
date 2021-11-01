package org.strings;

public class Demo {

	
	public static void main(String[] args) {
		String name="PraveenKumar";
		int number =3;
		
			
			System.out.println(name.charAt(0));
			System.out.println(name.length());
			System.out.println(name.equals("PrveenKumar"));
			System.out.println(name.equalsIgnoreCase("prveenkumar"));
			System.out.println(name.isEmpty());
			System.out.println(name.contains("Praveen"));
			System.out.println(name.startsWith("P"));
			System.out.println(name.substring(1));
			System.out.println(name.substring(1, 8));
			System.out.println(name.concat(" P"));
			System.out.println(name.indexOf("r"));
			System.out.println(name.lastIndexOf("r"));
			System.out.println(name.replace("Praveen", "Manoj"));
			System.out.println(name.trim());
			System.out.println(name.valueOf(number));
			System.out.println(name.join("-", "Praveen","Kumar"));
			System.out.println(name.join("/", "Praveen","Kumar"));
			
			
			String s = "Am I Teaching good";
			String[] words = s.split(" ");
		    for (String string : words) {
				System.out.println(string);
				
			}
			
		}
}
