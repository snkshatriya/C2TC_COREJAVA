package com.cg.collection;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildCardDemo {

	public static void main(String[] args) {
		List<Integer> intList =Arrays.asList(1,2,3);
		LowerBoundedWildCard.display(intList);
		
		List<Number> numberList =Arrays.asList(3,5,9);
		LowerBoundedWildCard.display(numberList);
	}

}
