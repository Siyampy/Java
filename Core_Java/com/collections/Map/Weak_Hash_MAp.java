/**
 * 
 */
package com.collections.Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/**
 * @author Siyam
 *
 */

class Temp1
{
	public String toString()
	{
		return "Temp1";
	}
	public void finalize()
	
	{
		System.out.println("Iam finalized");
	}
}
public class Weak_Hash_MAp
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WeakHashMap hm=new WeakHashMap();
		Temp1 t=new Temp1();
		hm.put(100, "Siyam");
		hm.put(200,"Rafgu");
		hm.put(300,"Karrie");
		hm.put(t, "Dhanush");
		System.out.println(hm);
//		System.out.println(hm.put(300,"Balmond"));
//		Here it replaces for the given ky th enew value and returns the old value.
		Set s=hm.keySet();
		System.out.println(s);
		Collection c=hm.values();
		System.out.println(c);
		Set s1=hm.entrySet();
		System.out.println(s1);
		
//		Here we use Iteratorsas the cursors
		Iterator i= s1.iterator();
		while(i.hasNext())
		{
			Map.Entry e=(Map.Entry)i.next();
//			if(e.getKey().equals(300))
//			{
//				e.setValue("Paramesh");
//			}
			System.out.println(e.getKey()+"   "+e.getValue());

		}
		System.out.println(hm);
//		HAshMap is Not Synchronized to get the synchronized version ofte HAsshMap
//		We use
//		Map m1=Collections.synchronizedMap(hm);
//		System.out.println("Syncronized version");
//		System.out.println(hm);
		
		
		
//		It is Stronger than the GC and hence even if the bject is without ref but associated with the HAshMap it wont get destroyed
//		Example
		
//		When Temp ref is pointing to nul we get
		
		
		t=null;
		System.gc();
	if(t==null)
	{
		System.out.println(" Temp destroyed but object associated with HashMap not destroyed by GC");
	System.out.println(t);
	}
	
		System.out.println(hm);

	}

}
