package com.reg_Exp;
//import javax.media.*;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Display_File_name {
	public static void main(String[] args)
	{
		// In file names we are going to display all the fle name 
		//from the directory
		
		
		// To get all txt files use reg exp ------[a-zA-Z0-9_.$]+[.]txt
		// Here to consider the . as the character then use within []
		int count=0;
		Pattern p=Pattern.compile(".+[.]mp3");
		File f= new File("E:\\audio songs\\Music");
		String[] s=f.list();
		for(String ss:s)
		{
			//System.out.println(ss);
			Matcher m=p.matcher(ss);
			final Player p=Manager.createRealizedPlayer(f.toURI().toURL());
			
			if(m.find()&&m.group().equals(ss))
			{
				//System.out.println(m.group());
				count++;
				System.out.println(ss);
			}
			//System.out.println(m.groupCount());
			
		}
		System.out.println(count);
		
		
	}

}
