package com.declarations_AccessModifiers;
import static java.lang.Math.sqrt;
import static java.lang.System.out;
//With static import Math. is not required
//But without static import it is required to include Math.
public class Static_Import 
{
	public static void main(String[] args)
	{
		out.println(sqrt(3));
	}
	//Priority of import in normal importing
	
//	1-------Explicit class import
//	  2----------implicit import   .*;
//	 but in Static import 
//	1-------->Current class static member
//	2---------->Explicit Static imporrt
//	3------------->Implicit Statioc moirt
}
