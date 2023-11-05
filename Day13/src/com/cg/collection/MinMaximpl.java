package com.cg.collection;

public class MinMaximpl<T extends Comparable<T>> implements MinMax<T> {
T[] values;
MinMaximpl(T[] obj){
	values=obj;
	
}
	@Override
	public T min() {
		T ol=values[0];
		for(int i=1;i<values.length;i++)
			if(values[i].compareTo(ol)<0)
				ol=values[i];
		return ol;
	}

	@Override
	public T max() {
		T ol=values[0];
		for(int i=1;i<values.length;i++)
			if(values[i].compareTo(ol)>0)
				ol=values[i];
		return ol;
}
	

}
