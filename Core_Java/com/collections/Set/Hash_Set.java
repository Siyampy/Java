/**
 * 
 */
package com.collections.Set;

import java.util.HashSet;

/**
 * @author Siyam
 *
 */
public class Hash_Set {

	/**
	 * @param args
	 * 
	 * 
	 * ==============================
	 * Underlyinf data structure-----HashTable
	 * Inserted based n the hashcode
	 * heterogeneous object allowed
	 * Best used for dearching operations
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		HashSet hs1=new HashSet(hs);//Colelction
		HashSet hs2=new HashSet(10);//Initial Capacity
//		Def IC=16
//		Default fill_ratio-0.75
		HashSet hs3=new HashSet(10,0.5f);//Fill-ratio with the fill ratio



		hs.add("A");
		hs.add("B");
		hs.add("C");

	}

}
