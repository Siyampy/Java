/**
 * 
 */
package com.collections.Set;

import java.util.TreeSet;

/**
 * @author Siyam
 *
 */
public class Navigable_Set 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		1.6 V enhancements 
//		To represent all the flight timings in the airport
//		Methods
		/**
		 * These are all for SortedSet 
		 * first()
		 * last()
		 * headSet()
		 * tailSet()
		 * subSet()
		 * USing this we cant met our req 
		 * if Before 10;00 o clock what is the last flight 
		 * if after 10:00 what is the first flight
		 * Here navigaton is not applicable in the SortedSet
		 * To fullfill that Navigable Set is introduced.
		 * 
		 * -------------------------------------------------
		 * Methods of navigableSet(I)
		 * 
		 * lower(10:00)-------> gives the before th last record of the record mentioned
		 * floor(10:00)-------->Beforth or at the mentioned record
		 * higher(10:00)-------->first record after the mentioned one
		 * ceiling(10:00)----------->the same record or the first record after the mentioned one
		 * pollFirrst()--------remove and return first ekement
		 * pollLast()---------remove and return last element
		 * descendingSet()------reverse order
		 * 
		 * 
		 * 
		 * Implementaton class----------TreeSet
		 * 
		 * 
		 *  
		 */
		
		TreeSet t=new TreeSet();
		t.add(1);
		t.add(2);
		t.add(5);
		t.add(15);
		t.add(0);
		t.add(2);
		t.add(5);
		System.out.println(t);
		System.out.println(t.size());
		System.out.println(t.contains(1));
		System.out.println(t.ceiling(-1));
		System.out.println(t.floor(6));
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
		System.out.println(t.lower(5));
		System.out.println(t.higher(2));
		System.out.println(t.headSet(5));
		System.out.println(t.tailSet(1, false));
		System.out.println(t.subSet(1,false,5,false));

	}

}
