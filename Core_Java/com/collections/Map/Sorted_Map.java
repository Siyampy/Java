/**
 * 
 */
package com.collections.Map;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author Siyam
 *
 */
class My_Comparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		String i1=o1.toString();
		String i2=o2.toString();
//		System.out.println(o1);
//		If we need DNSO use
//		return i1.compareTo(i2);
//		 If need reverse of the DNSO
		return -i2.compareTo(i1);
	}
}
public class Sorted_Map 
{

	/**
	 * @param args
	 * 
	 * 
	 * To rep the group of objects as the keyvalue pair and to sorrt the keys in somje order
	 * Implementation class -------TreeMap-Same as Tree Set
	 * Underlyong DS--------RedBlack tree for Tree MAp
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeMap tm=new TreeMap();
		TreeMap tm1=new TreeMap(new My_Comparator());
		tm1.put(101, "Siyam");
		tm1.put(102, "Dhanush");
		tm1.put(103, "Balmond");
		System.out.println(tm1);
		

	}

}
