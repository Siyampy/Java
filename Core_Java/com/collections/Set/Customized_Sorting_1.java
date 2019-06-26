package com.collections.Set;

import java.util.Comparator;
import java.util.TreeSet;

public class Customized_Sorting_1 
{
	/**
	 * @param args
	 * 
	 * 
	 * Her to generate the customized sorting we need to override the compare metod in Comparator If
	 * Hence to make our own compare() for comparing integer refer this
	 */
	public static void main(String[] args)
	{
		TreeSet t=new TreeSet(new My_Comparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		System.out.println(t);
		
		
	}

}
class My_Comparator implements Comparator
{
	public int compare(Object ob1,Object ob2)
	{
		Integer i1=(Integer)ob1;
		Integer i2=(Integer)ob2;
		if(i1<i2)
		{
			return -1;
		}
		else
		{
			if(i1>i2)
			{
				return +1;
			}
			else
			{
				return 0;
			}
		}
	}
//	Other posssible implementations of the compare()
	
//	public int compare(Object ob1,Object ob2)
//	{
	
//	return ob1.compareTo(ob2);//Default NSO Ascending
//	}
	
//	public int compare(Object ob1,Object ob2)
//	{
	
//	return -(ob1.compareTo(ob2));//Default NSO Descending
//	}
//	Others are also possible
//	By this method e can preserve the insertion order or preserve the opposite of the nsertion order and many more rtc..........

}
