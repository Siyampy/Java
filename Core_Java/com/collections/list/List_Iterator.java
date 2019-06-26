/**
 * 
 */
package com.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Siyam
 *
 */
public class List_Iterator {

	/**
	 * @param args
	 * 
	 * 
	 * Methods
	 * ==============================
	 * hasNext()
	 * next()
	 * nextIndex()
	 * hasPrevious()
	 * previous()
	 * previousIndex()
	 * remove()
	 * add()
	 * set()
	 * 
	 * 
	 * 
	 * 
	 * 
	 * ----------------------------------------------
	 * Use only for the list tye of the objects and cant be used forthe oter colection types
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList(500);
		List al2= Collections.synchronizedList(al);
		al.add(1);
		al.add("Siyam");
//		al.set(2, "Iam Inseretd at 3");//CE since we can set values to index ony when those indexes carries values
		al.addAll(al);
		ArrayList al1=new ArrayList(al2);
		LinkedList l=new LinkedList(al1);
		l.addFirst("Sachin");
		l.addLast("Sachin");
		ListIterator li=l.listIterator();
//		li.add("1"); Adds only at the first position
		int i=0;
		System.out.println(li.getClass().getName());
//		Here li is the i/F but it can 
		while(li.hasNext())
		{
			
			System.out.println(li.next());
			li.remove();
//			li.set("Fool1");
//			Set is to be called after next()/previous() or before the add()
//			li.add("Fool");// Adds after the reading 
//			System.out.println(li.previous());
			
			
		}
System.out.println(l);
	}

}
