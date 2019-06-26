package com.lang_pack;

public class Object_Class {
	static int i;
	public int hashcode()
	{
		return i;
		
	}
	{
		i++;
	}
public String toString()
{
	return "Object_Class@"+i;
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(new Object_Class().toString());
		System.out.println(new Object_Class().toString());

		System.out.println(new Object_Class().toString());

		
		System.out.println(new Object_Class().toString());

		System.out.println(new Object_Class().toString());

		System.out.println(new Object_Class().toString());

		

	}
//.equals()--> Ment nly for ref comparision in Objectclass 
//	If we need cintent cimoarison overrride this methos
}
