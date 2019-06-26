package com.collections.Set;

import java.util.TreeSet;

/**
 * @author Siyam
 * 
 * 
 * 
 * 
 * 
 * Duplicated not allowed
 * Insertion orderis not fixed
 * Only Homogeneous objects are used
 * Null insertionis  posssibe oonly once
 * 
 *
 */
public class Tree_Set
{
	public static void main(String[] args)
	{
		TreeSet t=new TreeSet();
		TreeSet t2=new TreeSet();

//		TreeSet t=new TreeSet(Comparator c);
//		TreeSet t=new TreeSet(Collecton c);
//		TreeSet t=new TreeSet(SortedSet s);?Here sorting orderis according to the SortedSet
		
t.add(1);
t.add(2);
t.add(5);
t.add(15);
t.add(0);
t.add(2);
t.add(5);
//t2.add(null);//Not allowed
System.out.println(t);
//If we are depending on the DefaultNatural Sorting Order then the Object Should be Comparable and Homogenius
//String---------Comparable
//StringBuffr-------Not Comparable
//All WrapperClasses --------ComparaBle


//Duplicates are not alowed But JVM Omits when Insertion
		
	}

}
