package com.cg.setinterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	
	static void addElements(Set<Integer> numberHashSet ) {
		numberHashSet.add(61);
		numberHashSet.add(41);
		numberHashSet.add(91);
		numberHashSet.add(51);
		numberHashSet.add(80);
		numberHashSet.add(11);
		numberHashSet.add(20);
		numberHashSet.add(null);
		
	}

	public static void main(String[] args) {
		Set<Integer> numberHashSet = new HashSet<>();
		addElements(numberHashSet);
		System.out.println(numberHashSet);
		
		Set<Integer> numberHashSetOne = new HashSet();
		numberHashSetOne.add(10);
		numberHashSetOne.add(11);
		numberHashSetOne.add(71);
		numberHashSetOne.add(20);
		numberHashSetOne.add(1);
		System.out.println(numberHashSetOne);
		
		Set<Integer> numberHashSetTwo = new HashSet();
		addElements(numberHashSetTwo);
		
		//Union
		numberHashSetTwo.addAll(numberHashSetOne);
		System.out.println("Union:  "+numberHashSetTwo);
		
		//Intersection
		numberHashSetTwo.retainAll(numberHashSetOne);
		System.out.println("Intersection:  "+numberHashSetTwo);
		
		// difference
		numberHashSetTwo.removeAll(numberHashSetOne);
		System.out.println("Difference:  "+numberHashSetTwo);
		
		
		

	}

}
