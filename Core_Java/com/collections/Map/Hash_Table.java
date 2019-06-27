/**
 * 
 */
package com.collections.Map;

import java.util.Hashtable;

/**
 * @author Siyam
 *
 */
class Temp2
{
	int i;
	Temp2(int i)
	{
		this.i=i;
	}
	public int hashCode()
	{
		return i%11;
	}
	public String toString()
	{
		return i+"";
	}
}
public class Hash_Table 
{

	/**
	 * @param args
	 * Heterogeneous for both key and values
	 * Synchronized--Thread -safe
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Hashtable ht=new Hashtable();
//		Hashtable ht1=new Hashtable<>(initialCapacity)
//		Hashtable h2=new Hashtable<>(Map t)
//		Hashtable ht2=new Hashtable<>(initialCapacity, loadFactor)
		ht.put(new Temp2(5), "Siyam");
		ht.put(new Temp2(2), "Sagoo");

		ht.put(new Temp2(6), "Babloo");

		ht.put(new Temp2(15), "Arjun");

		ht.put(new Temp2(23), "Poorna");

		ht.put(new Temp2(16), "Prithvi");
		System.out.println(ht);

		
		



		
		

	}

}
