package com.lang_pack;

public class AutoBoxing {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		Buffering conceopts for the Wrapper Cass Objects
		Integer i=127;
		Integer j=128;
				Integer k=129;
				Integer l=127;
				System.out.println(i==l);
				System.out.println(i==j);
				System.out.println(i==k);
				System.out.println(j==k);
				System.out.println(j==l);
				//Overloading methods using AutoBoxing Unboxing
//				Widning>AutoBoxing>var-arg
//				.equals() and hashcode() contract
//				If u overrifde teh.ewuas methos then overrrife thwe hasdhcode () ado0
				
				
				
				
//				if r1.equals(r2 )is true then r1.hashcode()==r2.hashcode()
//				ifr1.equals(r2) is false then the object can be insame bucket or in differernt buckaerts
//				If the hashcodes are equal we cant conclude anythng abo;ut the .equals() method it may returns true arfalse
				
//				If the hashcodes are  not equal then these objects are always notewual by the .equual () 
				
				
				
//				 In all collection classes and wrapper classes and zString the .equals() is overrrien for content com.Hence it is highl;y recommended to override .equals() for content comparison
				

	}

}
