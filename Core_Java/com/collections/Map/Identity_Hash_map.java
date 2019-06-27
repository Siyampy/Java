/**
 * 
 */
package com.collections.Map;

import java.util.IdentityHashMap;

/**
 * @author Siyam
 *
 */
public class Identity_Hash_map {

	/**
	 * @param args
	 * 
	 * 
	 * Here the HashMap and IHM is same but only differernce is 
	 * To find the duplicate keys IHM uses == operators and hence the duplicate keys r allowed
	 * 
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		IdentityHashMap id=new IdentityHashMap<>();
		id.put(new String("10"), "Siyam");
		id.put(new String("10"), "Paramesh");
		id.put(new Integer("10"), "Siyam");
		id.put(new Double("10.006"), "Paramesh");
		System.out.println(id);

	}

}
