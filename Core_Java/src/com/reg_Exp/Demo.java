package com.reg_Exp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo 
{
public static void main(String[] args) 
{
	//To rep agroup of string according to a particular pattern 
	//To rep mail_id,Phone no
	// PAttern Mtching Applications like Searching,finding uses regular Expression
	// Lexical Analysis use Regu;lar Expresson
	//Translators use RE
	//To develop Digital Circuits
	//To develop Communiation protocols
	
	
	// These classes are available in the java.util.regex package
	//1. Create PAttern Object using Pattern p= Pattern.compile("");
	//2. Create MAtcher Object p.matcher("target String");matcher() available in Pattern class
	//3. Use m.find() to check availability of the  pattern in the targt String
	//   m.start() is used to find the index of starting position of the targetstring according to te pattern
int count=0;
	Pattern p=Pattern.compile("ab");
	// Here Pattern object is a compiled version of Reg Exp
	Matcher m=p.matcher("abbbabbbabababababbbbbab");
	while(m.find())
		//always find the next match and returns bool
	{count++;
		System.out.println(m.start()+" -------"+m.end()+"  -----"+m.group());
	}
	System.out.println("No of Occurences\t"+count);
	
	//Pattern p1=Pattern.compile("[abc]");
	//Pattern p1=Pattern.compile("[^abc]");
	//Ways to use the Matcher and Pattern
	
	Pattern p1=Pattern.compile("\\s");
	Matcher m1=p1.matcher("asssssss");
	while(m1.find())
	{
		System.out.println(""+m1.group());
	}
	//To check whether the following Pattern matches with the following String then use
	System.out.println(Pattern.compile(".s").matcher("as").matches());

	//https://www.javatpoint.com/java-regex
	System.out.println(p1.pattern());
	Pattern p2=Pattern.compile("\\.");//Prints Nothing
	//or
	Pattern p3=Pattern.compile("[.]");//Prints Nothing

	// Similarly we can apply this and can rint the following according to our reqirements
	String[] ss=p3.split("Hai. How. are. you. darling");
	
	// Same in String class
	String s="Siyam Brothers Home";
	String[] s1=s.split("\\s");
	for(String s3:ss)
	{
		System.out.println(s3);
	}
	for(String s2:s1)
	{
		System.out.println(s2);
	}
	// Reg Exp to rep the 10 digit Mobile No
	
//	[789][0-9]{9}
//	
//	or
	
//	(0/91)?[789][0-9]{9}
	
//	Regular exp to rep the mail-id
	
//	[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+[[.][a-zA-Z]+]+
	If only gmail Id's to check then
//	[a-zA-Z0-9][a-zA-Z0-9_.]*@gmail[.]com
	
	
}
}
