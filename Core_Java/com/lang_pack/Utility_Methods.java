package com.lang_pack;

public class Utility_Methods 
{
	//valueOf()
	//xxxValue()
//	parseXxx()
//	toString()

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Value OF-----------> Primitive------->Wrapper Object
		
		
		
		
		
		//T crete Wrapper object for the given value/String
		Integer i=Integer.valueOf("1111",2);
		//Better than new Integer();
//		Esxcept  char class ver;y one contain the sdtstic valueof method to create wrappwer object for the givenstring
		Boolean b=Boolean.valueOf("Siyam");
		System.out.println(i);
//		For primitive only thencharacter can be used
		Character c=Character.valueOf('a');
		System.out.println(c);
		
		
		
//		  xxxValue()-------------Wrapper object to the Primitive
		System.out.println(i.intValue());
		System.out.println(b.booleanValue());
		System.out.println(c.charValue());
		

//parseXXX()
//		String to primitive
		System.out.println(Integer.parseInt("20",8));
		
//		toString()
		
//		Wrapper object/Primitive-------->String
		System.out.println(Integer.toHexString(20));
		System.out.println(Integer.toBinaryString(20));

		System.out.println(Integer.toOctalString(20));


	}
	

}
