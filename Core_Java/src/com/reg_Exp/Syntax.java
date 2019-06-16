package com.reg_Exp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Syntax 

{
	//=========={{{{Character Classes}}}}================
	
	//[abc]------------It matches either a or b or c.
		//[^abc]-----------Except a and b and c;
		//[a-z]------------Any lower case alphabet Symbol from ato z
		//[A-Z]------------------Upper case
		//[a-zA-Z]----------Any alphabets
		//[0-9] -----------Any digit from 0-9
		//[0-9a-zA-Z]--------Any Alphanumeric symbol
		//[^0-9a-zA-Z]-----------Except Alphanumeric charecters(Special Symbols)
	//[a-z&&[def]]---------------Intersection
	//[a-d[m-p]]----------------Union
	
	//===========Regex Metacharacters==================
	// Predefined Character Classes
//	\s-------------Space cahracter
//	\S-------------Not a space character
//	.  ----------Any character (may or may not match terminator).
//	\d---------Any digit from 0-9
//	\D---------Except Digit any character
//	\w----------Any Word (Alphanumeric )
//	\W----------Except Word(Special Charecters)
	
	public static void main(String[] args) 
	{
		Pattern p;
		Matcher m;
		
	}
	
	///---------------Quantifiers------------------
	
//
//  Regex	            Description
	
//  X?	             X occurs once or not at all(Atmost 1 X)
//  X+	           X occurs once or more times
	//Atleast one character
//  X*	           X occurs zero or more times(Any no of X)
//  X{n}	           X occurs n times only
//  X{n,}	          X occurs n or more times
//  X{y,z}	        X occurs at least y times but less than z times
//

}
