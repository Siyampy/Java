/**
 * 
 */
package com.generics;

import java.util.ArrayList;

/**
 * @author Siyam
 * If we send gen obj t o non gen area  then it starts behaving like non-gen object
 *  * If we send non-gen obj to gen area  then it starts behaving like gen object
 *  
 *  
 *  (ie) Location in wich obj presents based on that behavior is defined....
 
 */
public class Comm_with_Non_Generic_Code {

	/**
	 * Veg  ------------------------Nonveg example
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void m1(ArrayList l)
	{
		l.add("Siyam");
		l.add(10);
		l.add(30.98);
		l.add(true);
		//l.addAll(l);
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<String> l=new ArrayList<String>();
		ArrayList l1=new ArrayList<String>();//refer down for clarity
		l.add("Sachin");
		l1.add("Sachin");

		//Only String is valid because the parameter mentioned only can be inserted
		m1(l1);
		m1(l);
		System.out.println(l1);
		System.out.println(l);

		//l.add(10);-----------------------------> Not valid 

	}

}




