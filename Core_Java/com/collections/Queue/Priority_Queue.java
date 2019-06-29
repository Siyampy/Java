/**
 * 
 */
package com.collections.Queue;

import java.util.PriorityQueue;

/**
 * @author Siyam
 *
 */
public class Priority_Queue
{

	/**
	 * @param args
	 * 
	 * Homogeneous---DNSO
	 * Heterogeneousd------Customized sorting usingComparator
	 * null insertion------Not possible.
	 * Insertion ordernot preserved but basd on the priority
	 * 
	 * 
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		Cons
	PriorityQueue p=new PriorityQueue<>();
//	PriorityQueue p1=new PriorityQueue<>(collection);
//	PriorityQueue p2=new PriorityQueue<>(initialCapacity, comparator);
//	PriorityQueue p3=new PriorityQueue<>(PriorityQueue);
//	PriorityQueue p4= new PriorityQueue<>(sortedSet);
//	PriorityQueue p5=new PriorityQueue<>(initialCapacity);
//	PriorityQueue p6=new PriorityQueue<>(comparator);

	for(int i=0;i<10;i++)
	{
		p.offer(i+"");
	}
	p.add("Siyam");
	p.offer("Dhanush");
	p.offer("Sachin");
	
	System.out.println(p);
	System.out.println(p.poll());
	System.out.println(p);

	}
	

}
