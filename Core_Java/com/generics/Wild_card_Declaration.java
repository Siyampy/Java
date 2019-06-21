package com.generics;

import java.util.ArrayList;

public class Wild_card_Declaration 
{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		
		
//		Here we discuss the Declaration of object creation for the Generic classes with the wildcard character.
		
//		Valid
		//1   ArrayList<String> l=new ArrayList<String>();
		//2		ArrayList<?> l=new ArrayList<String>();
//		ArrayList<?> l=new ArrayList<Integer>();
//	ArrayList<? super String> l=new ArrayList<Object>();
//	ArrayList<? super String> l1=new ArrayList<String>();
//	ArrayList<? extends String> l1=new ArrayList<String>();
//		ArrayList<? extends Number> l1=new ArrayList<Number/Integer/Double etc>();
//But
//		Invalid when type mismatch occurs
//		ArrayList<? extends Number> l1=new ArrayList<String>();
//		ArrayList<?> l1=new ArrayList<?>();
//		ArrayList<?> l1=new ArrayList<? extends Number>();
// Since ? can be a Class or I/F so we cant extend a inf with class 



	}

}
