/**
 * 
 */
package com.collections.Map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Siyam
 *
 */
public class Properties_ 
{

	/**
	 * @param args
	 * To communicate between the JAva andthe dynamic values 
	 * It improves the readability by reducing the problems on hardcoding the values like username,password etc 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		// TODO Auto-generated method stub
		Properties p=new Properties();
		p.load(new FileInputStream("com\\collections\\Map\\db.properties"));
		System.out.println(p);
		String s=p.getProperty("pass");
		System.out.println(s);
		p.setProperty("email", "dhanush0206@gmail.com");
		p.store(new FileOutputStream("com\\\\collections\\\\Map\\\\db.properties"), "Updated Email");
		System.out.println(p);
//		Power of properties
//		Without properties there isno java project exists
//		Here we dont need to recompile the program
//		If we normally run the rogram it wil be reflected automatically
		

	}

}
