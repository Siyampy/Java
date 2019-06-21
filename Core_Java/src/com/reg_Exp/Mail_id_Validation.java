package com.reg_Exp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mail_id_Validation
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+[[.][a-zA-Z]+]+");
		Matcher m=p.matcher(s);
		if(m.find()&&m.group().equals(s))
		{
			System.out.println("Valid Mail Id");
		}
		else
		{
			System.out.println("Invalid Id");
		}
	}
}
