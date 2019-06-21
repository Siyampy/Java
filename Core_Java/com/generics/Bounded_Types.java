/**
 * Here when we use the T as the parameter we can use any Reference types and when we use Number and its child classes the functionality
 * of the adition,sub,mul,div is possible due to internal primitive conversion.
 * But for the Other Objects these operations are not possible.
 * Hence To bound the functionality within the requied boundary we use the Bounded types for the Generic Parameter wich Extends the following 
 * Class and so its functionality is been bounded within it and its child classes.
 * We ++++++++++++must+++++++use extends to make aBounded parameter from the unbounded one. 
 * Other BoundedParameters are not applicable
 * --------implements============Interface
 * ---------super=================The following class and its super class 
 * class Gen1<T extends Number>
 * class Gen1<T implements Runnable>-----------Not applicable but we can replace the implements with the extends then it is poossible 
 * ----------------------Her in Boundedtypes the extends is use for interface also
 * class Gen1<T super Number>------------------Not applicable
 * 
 * 
 * 
 * 
 * Syntax for the Bounded Types:
 * class Tst<T extends X>
 * {
 * }
 * X can be either class or i/f
 * 
 * 
 * 
 * We can define bounded types in the combination also:
 * Eg:Class Test<T extends Number&Runnable>
 * {
 *Valid
 * }
 * As the type parameter ,We can take anything wich should be child class of Number and should Implements Runnable I/f
 * 
 * 
 * Class test<T extends Comparable&Runnable>
 * {
 * * Class test<T extends Comparable&Runnable>
 * {
 * Valid
 * }
 * * Class test<T extends Number&Comparable&Runnable>
 * {
 * Valid
 * }
 * but
 * Class test<T extends Runnable&Number>
 * {
 * InValid since the Interface cant be extended more than once here
 * }
 *  Class test<T extends Number&Integer>
 * {
 * InValid since we cant extends more than one class(Multiple ineritance )
 * }
 * 
 * 
 * 
 * 
 * Note
 * ===================================
 * Type Parameter can be any valid Number
 * We can take more than one type Parameters in the generics basedon our requirements
 * 
 *  Class test<T,T1>
 * {
 *-------Valid
 * }
 *  class hashmap<K,V>
 *  {
 *  valid
 *  }
 *  Hashmap<Integer,String> hm=new HAshMap<Integer,String>(1,"Siyam");
 */
package com.generics;

//class Gen1<T extends Number>
//{
//
//}
class Test<T extends Runnable>
{
	
	
}


public class Bounded_Types {


	public static void main(String[] args) 
	{
		Test<Thread> t1=new Test<Thread>();//OK
		Test<Runnable> t2=new Test<Runnable>();//OK

	}

}
