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
public class Customized_Sorting_3 {

	/**
	 * @param args
	 * 
	 * 
	 * 
	 * 
	 *sort according to the increasing order of the names
	 *
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet(new My_Comparator2());
		t.add("Alpha");
		t.add("Karrie");
		t.add("Roger");
		t.add("Balmond");
		t.add("Celine");
		System.out.println(t);

	}

}
class My_Comparator2 implements Comparator
{
	public int compare(Object ob1,Object ob2)
	{
		String s1=(String)ob1;
		String s2=(String)ob2;
//		return -s1.compareTo(s2);
		int l1=s1.length();
		int l2=s2.length();
		if(l1>l2)
		{
			return +1;
		}
		else
		{
			if(l1<l2)
			{
				return -1;
			}
			else
			{
				return s1.compareTo(s2);
			}
		}
	}
}