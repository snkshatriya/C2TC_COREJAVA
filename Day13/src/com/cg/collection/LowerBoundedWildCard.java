package com.cg.collection;
import java.util.List;
public class LowerBoundedWildCard {
	
public static void display(List<? super Integer> list) {
	
	for(Object n:list) {
		System.out.println(n);
	}
	
}
}
