package com.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo 
{
	public static void main(String[] args)
	{
		//Generrics Demo
//		To provide the type safety 
//		and to resolve the type casting problems
		
		//TypeCasting
		
//		Arrays are type safe
		//But ArrayList are Not type Safe(Collectons are not type safe)
		
		
		//TypeCasting
//		Example
		
		ArrayList a=new ArrayList();
		// To make it type safe and to resolve the typecasting problems
//		ArrayList<String> l1=new ArrayList<String>();
//		List<String> l1=new ArrayList<String>();
	Collection<String> l1=new ArrayList<String>();


		l1.add("Siyam");
		l1.add("Sachin");
		l1.add("Siyam");
		l1.add("Sachin");
		System.out.println(l1);
		//While using Generics we need no TypeCasting as the generics provide the type on the declaration
		
		// Using the parent ref to hold the child object
		
//		AL<String> l=new Al<String>();
//		List<String> l=new AL<String>();
//		Collection<String> l=new AL<String>();
		
//		ArrayList<String> l1=new ArrayList<String>();
//		List<String> l1=new ArrayList<String>();
//	Collection<String> l1=new ArrayList<String>();
		
		
	//ArrayList<Object> l=new ArrayList<String>();  //CE:Incompatible types
		
//		Polymorphic types are possible only for the base types and not for the parameter types
		 
		
		
//		---------------Parameter---Only the reference types and cant be the primitive types.
		
		
		//Generic Classes
		
//		untill 1.4 V
//		Non-generic ArrayList
//		--------------------------
//		class AL
//		{
//			add(Object o);
//			
//			Object get(int index)
//		}
		
//		Here type casting is always required andso the type safety is not there.
		
//But in 1.5,
// Generics evolved and this problemgot solved
//Generic version of the ArrayList
		
//		class Al<T>
//		{
//			add(T t)
//			{
//				
//			}
//			
//			return get(int index);
//		}
//		When T-------String ,T will be replaced so when compilation the compiler converts it into the type that is been Specified in the paramaeters
//		class Al<String>
//		{
//			add(String s)
//			{
//				
//			}
//			return get(int index);//Returns String
//		}
		
//Due to the parameter T it become type Safe
//		generic classes are also called as the template classes
		
//		Gen classes is also use for other normal classe othe than collections
		
		
		
		
//		Eg:
//		class Account<T>
//		
//		{

			
//		}
//Base on our req we can define our own generic classes also
//	Account<Gold> a1=new Account<Gold>();
//	Account <Platinum> a2=new Account<Platinum>();
		
		
		
		
	}

}
