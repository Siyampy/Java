/**
 * 
 */
package com.collections.Set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Siyam
 *
 */
public class Customized_Sorting_2
{

	/**
	 * @param args
	 * 
	 * In String objects the elements are to be assigned to the descending order in Tree Set
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		We can add Strinfg or Sb objects in the add Method argument
		TreeSet t=new TreeSet(new My_Comparator1());
		t.add("Alpha");
		t.add("Karrie");
		t.add("Roger");
		t.add("Balmond");
		t.add("Celine");
		System.out.println(t);
		

	}

}
class My_Comparator1 implements Comparator
{
	public int compare(Object ob1,Object ob2)
	{
		String s1=(String)ob1;
		String s2=(String)ob2;
		return -s1.compareTo(s2);
	}
}
	
