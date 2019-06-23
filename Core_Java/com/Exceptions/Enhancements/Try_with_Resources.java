package com.Exceptions.Enhancements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Try_with_Resources 
{
public static void main(String[] args)throws IOException 
{
	// The resources opened by us is closed automatically by JVM with try withReasources
	try(BufferedReader br=new BufferedReader(new FileReader("E:\\GAmes\\Git\\Java\\Core_Java\\com\\Exceptions\\Enhancements\\input.txt")) )
	{
		String s=null;
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
		
	}
//	Also open the multiple resources using the Try with the multipke resources 
try(BufferedReader br=new BufferedReader(new FileReader("E:\\GAmes\\Git\\Java\\Core_Java\\com\\Exceptions\\Enhancements\\input.txt"));PrintWriter p=new PrintWriter("E:\\GAmes\\Git\\Java\\Core_Java\\com\\Exceptions\\Enhancements\\output.txt"))
{
	String s=null;
	while((s=br.readLine())!=null)
	{
		p.println(s);
		
	}
	p.flush();
	//These are the autoclosable resources
//	variablesa assigned in the try with resources are imlicitly final
	// Try with resources doesnt need finakly bock
	
}
}
}
