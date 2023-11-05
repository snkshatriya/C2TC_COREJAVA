package com.cg.collection;

import java.util.ArrayList;

public class UpperBoundedWildcardDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intList = new ArrayList<>();
		ArrayList<Float> floatList = new ArrayList<>();
		ArrayList<Double> doubleList = new ArrayList<>();
		 intList.add(1);
	        intList.add(2);
	        floatList.add(1.5f);
	        floatList.add(2.5f);
	        doubleList.add(1.1);
	        doubleList.add(2.2);

	        double intSum = UpperBoundedWildcard.sumOfList(intList);
	        double floatSum = UpperBoundedWildcard.sumOfList(floatList);
	        double doubleSum = UpperBoundedWildcard.sumOfList(doubleList);

	        System.out.println("Sum of integers: " + intSum);
	        System.out.println("Sum of floats: " + floatSum);
	        System.out.println("Sum of doubles: " + doubleSum);

	}

}
