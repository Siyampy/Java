package com.collections.list;

import java.lang.reflect.Array;
import java.util.Enumeration;
import java.util.Vector;

public class Vector_Class
{
	public static void main(String[] args) 
	{
//		Cons
		Vector v=new Vector();
	Vector v1=new Vector(100);
	Vector v2=new Vector(100,2);
	
//	Methods
	v.addElement("Hi");
	v.addElement("How");
	v.addElement("are");
	v.addElement("you");
	System.out.println(v+""+v.capacity()+""+v.size());
	
//	?To iterate the elements oneby ne one by one
	Enumeration e=v.elements();
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
	
		
	}

}
