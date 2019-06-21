package com.generics;
//?  Type parameter can be declared at both teh class level or at method level

public class Generic_Methods {
	
	// To provide the type safety only for the methods and not for the Class
//	then use this
//	Bounded types also possible
	
	
	public <T>void m1(T ob)
	{
		// We can use T anywhere within this method before return type based on the requirements
//		Bounded types also possible
 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
