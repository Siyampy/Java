package com.fundamentals;

public class Literals
{
public static void main(String[] args)
{
	// Integral literals
	//Decimal,Octal,Hexadecimal
	int x=10;
	int y=07;
	int z=0xFACEBABE;
	//double d=0X1.0;//Error
	double d=0777;//Oak
	float f=10;
	//JVM Converts to base 10 by default
	System.out.println(x);
	System.out.println(y);

	System.out.println(z);
	
	//System.out.println();

	System.out.printf("%d   %d\n",8,9);
	//Arrays
	
	//Fixed in size
	//Homogeneous
	//Indexed Collection of fixed no  of homogenious data elements
	
	// int[] x;// Recommended ---Name is clearly separeted from the type
	
	
	
	
	//array size datatype-------byte,short,char,int	
	
	
	
	//Element level promotion is only for the Primitives and not for Arrays.
	//byte array cant be promoted to int array.
	//but String[] ------> Object[] 
	//since for onl the referrence type aray itis been possible
	String[] s= {"abc","def"};
	Object[] o=s;
	//Declaration,Creation and Initialization
	int []x1;int x2[];//Correct
	x1=new int[10];
	x2=new int[10];
	x1[0]=20;
	System.out.println(x1[0]);
	int y1[][]= { {1,2},{3,4}};
	System.out.println(y1[1][1]);
//	System.out.println(x1.getClass().getName());
//	System.out.println(x2.length);
	// Using MAtrix we get memory wastage so we use 
	//Arrays of arrays
	
	//length vslength()
	
	//length-------Arrays
	//length()----------For String
	//Anaonymous array

	


	
	
}
}
