package com.cg.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityDemo {

	public static void main(String[] args) {
		Queue<String> pq =new PriorityQueue<String>();
		pq.add("core Java");
		pq.add("React");
		pq.add("hTML");
		pq.add("Angular");
		
		//capital have more priority than lower case
		System.out.println(pq);
		System.out.println("Size of the queue " +pq.size());
		System.out.println(pq.containsAll(pq));
		System.out.println("first element to be printed is = "+pq.peek());
		System.out.println("first element to be removed is = " +pq.poll());
		System.out.println(pq);
		//iteration
		Iterator<String> iterator=pq.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
			
	}

}
