package org.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapdemo {

	public static void main(String[] args) {

		/*		Hashmap print in random order*/
		Map<Integer, String> m = new HashMap<Integer, String>();

		m.put(10, "praveen");
		m.put(8, "dinesh");
		m.put(52, "magi");

		System.out.println("Hashmap prints in random order" + "\n" + m);
		
		/*		Linked hash map print in inseriton order*/
		Map<Integer, String> a = new LinkedHashMap<Integer, String>();

		a.put(10, "praveen");
		a.put(8, "dinesh");
		a.put(52, "magi");
		System.out.println("linkedhashmap print in insertion order"+"\n"+a);
		
		/*Treemap print in ascending oder*/
		Map<Integer, String> b = new TreeMap<Integer, String>();

		b.put(10, "praveen");
		b.put(8, "dinesh");
		b.put(52, "magi");
		System.out.println("Tree map print in Ascending order"+"\n"+b);
		
		/*Hashtable print in random order*/
		Map<Integer, String> c = new Hashtable<Integer, String>();
		
		c.put(10, "praveen");
		c.put(8, "dinesh");
		c.put(52, "magi");
		System.out.println("Hashtable print in random order"+"\n"+c);
		
	}

}
