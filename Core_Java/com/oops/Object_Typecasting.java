/**
 * 
 */
package com.oops;

/**
 * @author Siyam
 *
 */
public class Object_Typecasting {

	/**
	 * 
	 */
	public Object_Typecasting() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		
//		A b=(C)d;
//		 Compiler checks
		
		
//		1--------------Incompatible types between the A and C
//		2.-------------Interconvertable typesbetween the C and d
		
//		JVm Checks 
		
//		 1.------------Underlying object d must be same or the dericvrf type otherwise ClassCastException
Integer i=new Integer(1);
Number n=(Number)i;
Object o=(Number)i;
//String s=(Number)i;// Type Mismatch


	}

}
