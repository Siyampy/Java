package com.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class A
{
	
}
class B
{
	
}
class C
{
	}

public class C_list 
{
public static void main(String[] args) 
{
	//Collection
//	These contain the common methds for the imlementation clazszs
	ArrayList al=new ArrayList(500);
	List al2= Collections.synchronizedList(al);
	al.add(1);
	al.add("Siyam");
//	al.set(2, "Iam Inseretd at 3");//CE since we can set values to index ony when those indexes carries values
	al.addAll(al);
	ArrayList al1=new ArrayList(al2);

	
	System.out.println(al1);
//	It is recommeended to use the generics with the ArrayList or Collection classes
	
	
	
//	ArrayList is suitable for the retrieval operations
//	It is not synchronized so not thread safe
//	To make te AL synchronized then we use Collections.synchronizedList();
	
	
}
}
