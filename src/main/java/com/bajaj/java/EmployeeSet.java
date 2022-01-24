package com.bajaj.java;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;


public class EmployeeSet {

	public static void main(String[] args) {
		Set<Integer> treeset = new TreeSet<Integer>();
		treeset.add(1);
		treeset.add(4);
		treeset.add(1);
		treeset.add(2);
		treeset.add(7);
		
		System.out.println(treeset.toString()); 
		//System.out.println(treeset.contains(1));
		
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("first");
		hashSet.add("second");
		hashSet.add("third");
		hashSet.add("fourth");
		System.out.println("hashset");
		System.out.println(hashSet.toString()); 
		//System.out.println(hashSet.contains("first"));
		
		Set<String> linkedhashSet = new LinkedHashSet<String>();
		linkedhashSet.add("third");
		linkedhashSet.add("first");
		linkedhashSet.add("second");
		linkedhashSet.add("fourth");
		
		System.out.println(linkedhashSet.toString()); 
		//System.out.println(linkedhashSet.contains("first"));
		//linkedhashSet.forEach((v)->System.out.println(v));
		
	}

}
