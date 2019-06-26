package com.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iterator_ 
{
	
//	Universal Cursor
//	Read/Write possible to objects
//	For any Collection Objects
//	Methods
//	remove(),hasNext(),next()
public static void main(String[] args) 
{
	ArrayList al=new ArrayList(500);
	List al2= Collections.synchronizedList(al);
	al.add(1);
	al.add("Siyam");
//	al.set(2, "Iam Inseretd at 3");//CE since we can set values to index ony when those indexes carries values
	al.addAll(al);
	ArrayList al1=new ArrayList(al2);
	LinkedList l=new LinkedList(al1);
	l.addFirst("Sachin");
	l.addLast("Sachin");
	Iterator i=l.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
//	Limitations
	
//	Move only in the forward directions,acccessing the previois element is not posssible
//	So we go for ListIterator
}
}
