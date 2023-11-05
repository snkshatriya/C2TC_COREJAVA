package com.cg.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q =new LinkedList<Integer>();
		//{0,1,2,3}
		for(int i=0;i<5;i++) {
			q.add(i);
		}
		System.out.println(q);
		
		//remove an element
		int removal=q.remove();
		System.out.println(removal);
		
		System.out.println(q);
		
		//to get first index value(head of queue)
		int head=q.peek();
		System.out.println(head);
		
		//to remove an element
		int delete=q.poll();
		System.out.println(delete);
		System.out.println(q);
		
		System.out.println("size of the queue" +q.size());	
		
		

	}

}
