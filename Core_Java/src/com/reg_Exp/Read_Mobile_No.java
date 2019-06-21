package com.reg_Exp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Read_Mobile_No
{
	public static void main(String[] args) throws IOException 
	{
		//Find Mobile No where it is mixed with normal test data
	// To find out all the mail-id from the file same procedure but replace the pattern
		try {
		PrintWriter pw=new PrintWriter("F:\\Education\\JAVA\\J2EE\\Core_Java\\src\\output.txt");
		Pattern p=Pattern.compile("(0/91)?[7-9][0-9]{9}");
		File f=new File("F:\\Education\\JAVA\\J2EE\\Core_Java\\src\\input.txt");
		BufferedReader br=new BufferedReader(new FileReader(f));
		String line = br.readLine();
	StringBuilder sb=new StringBuilder("");
		String[] ss=new String[200];
		for(int i=0;line!=null;i++)
		{
			ss[i]=line;
			sb.append(line);
			line = br.readLine();
		}
		System.out.println(new String(sb).replaceAll("\\s+",""));
				Matcher m=p.matcher(sb);
				while(m.find())
				{
					pw.println(m.group());
				}		
	pw.flush();
		br.close();		
		pw.close();
	} catch (FileNotFoundException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
}
