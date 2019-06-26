/**
 * 
 */
package com.collections.list;

import java.util.Enumeration;
import java.util.Stack;

/**
 * @author Siyam
 *
 */
public class Stack_Class {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push("Siyam");
		s.push("Hi");
		s.push("How ");
		s.push("are");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		Enumeration e=s.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}


	}

}
