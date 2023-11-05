package com.cg.collection;
import java.util.ArrayList;
import java.util.List;
public class UpperBoundedWildcard {
	public static Double sumOfList(ArrayList<? extends Number> al) {
		double sum=0.0;
		for(Number n:al) {
			sum=sum+n.doubleValue();
		}
		return sum;
	}

}
