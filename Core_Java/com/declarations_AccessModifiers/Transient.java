package com.declarations_AccessModifiers;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Transient implements Serializable
{
	int i=10,j=20;
	transient int k=30;
	public static void main(String[] args)
	{
		FileOutputStream f=null;
		ObjectOutputStream os=null;
		try {
			 f=new FileOutputStream("E:\\GAmes\\Git\\Java\\Core_Java\\bin\\com\\declarations_AccessModifiers\\abc.txt");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 os=new ObjectOutputStream(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			os.writeObject(new Transient());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
