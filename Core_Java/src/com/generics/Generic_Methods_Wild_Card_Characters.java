/**
 * Generic Methods and WildCard Characters
 * 
 * 
 * 
 * Here Generic Methods declaration and method calling is been done.
 * Type_1:
 * ----------------
 * m1(Al<String> l)
 * {
 * }
 * 
 * Type 2:
 * ----------------
 * m1(AL<?> l)
 * {
 * ? is the WildCard Character which denotes any reference type hence to this method any reference can be passed to imrove the 
 * readability of the code.
 * Points to remember:
 * 1-----------How to call the method
 * 2-----------Within method what we can do
 * Eg
 * Consider the generic  classes
 * Account<Gold> a1=new Account<Gold>(); 
 * m1(a1);
 * Account<Integer> a1=new Account<Integer();
 * m1(a1);
 * Account<String> a1=new Account<String>();
 * m1(a1);
 * Account<Double> a1=new Account<Double>(); 
 * m1(a1);
 * also
 * public  s v m1(Account<String> a)
 * {
 * a.add("a");
 * a.add("b");
 * a.add(10);-----------------------Invalid
 * }
 *  * 1-----------How to call the method----------------------------Using String Arguments 
 * 2-----------Within method what we can do--------------------------Only add the String incase of arraylist while specifying others we get Compile time Error
 * 
 * 
 * 
 * for these classes to call the generic method we need to implement the method for the specific type separate implementations are to be provided 
 * which decreases readability  of the code 
 * So to call these methods at runtime we use only one method with wildcard character to accept any ref type
 * public  s v m1(Account<?> a)
 * {
 * }
 * and
 * public  s v m1(Account<? extends X> a)
 * {
 *---------Valid
 * }
 * and also
 * public  s v m1(Account<? super X> a)
 * {
 * ====================VAlid
 * With class level only supr is not allowed but it is possile in method
 * }
 * 
 * 
 * 
 * But here====================================================
 *  * 1-----------How to call the method-------------------Using Any type
 * 2-----------Within method what we can do---------------Only null is allowed and no other can be added 
 * 
 *  public  s v m1(Account<?> a)
 * {
 * a.add("a");-----------------------Invalid
 * a.add("b");-----------------------Invalid
 * a.add(10);-----------------------Invalid
 * a.add(null);------Valid
 * 
 * 
 * 
 * 
 * Since we cant guarentee the type we pass to the method
 * This type of methods are besst suitable for readonly concepts.
 * }
 * 
 * 
 * Type-3----------------------------------------------------------------
 * 
 * m1(AL<? extends X> a)
 * {
 * ************* X can be a class o the I/F
 * If  X is a class we can call this method by passing either AL<X> type or its child classes
 * If X is an Interface then we can call ths methos by either AL<X > r its imp class
 * 
 * }
 * 1-----------How to call the method-------------------||^^
 * 2-----------Within method what we can do--------------Only null is allowed and no other can be added 
 *  Since we cant guarentee the type of X we pass to the method
 * Same as  the Type-----2 
 * Used only for the readOnly purpose
 * 
 * 
 * 
 * 
 * Type--4----------------------------------
 * m1(AL<? super X> a)
 * X can be either Class or I/F.
 * If X is a class we can call this method by passing either AL<X> type or its ===|||super||||=== classes
 * If X is an Interface then we can call ths methos by either X type or the super class of the implemented class type .
 * 
 * Eg;;;;
 * If
 *  m1(AL<? super Runnable > a)
 *  {
 *  }
 *  Then we can call tis method by Object since Imp,emented Class Thread has super class of type Object.
 * 
 * 
 * 
 * Within method what we can do--
 * --------------We can add the X type of Objects and null also
 */
package com.generics;

/**
 * 
 *
 */
public class Generic_Methods_Wild_Card_Characters {

	/**
	 * @param args
	 */ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
