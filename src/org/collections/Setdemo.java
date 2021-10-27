package org.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setdemo {

	public static void main(String[] args) {
	
		/*Set is value based
		not allow duplicates
		index based methods can't be initialized here*/
		
	Set<String> carnivors = new HashSet<String>(Arrays.asList("tiger","lion","fox","cheeta"));
	System.out.println("Hash set prints in random order:"+"\n"+carnivors);
	System.out.println("===============");
	Set<String> carnivors1 = new LinkedHashSet<String>(Arrays.asList("tiger","lion","fox","cheeta"));
	System.out.println("LinkedHash set print in insertion order:"+"\n"+carnivors1);
	System.out.println("==============");
	Set<String> carnivors2 = new TreeSet<String>(Arrays.asList("tiger","lion","fox","cheeta"));
	System.out.println("Tree set prints in Ascending order"+"\n"+carnivors2);
	
}
}
