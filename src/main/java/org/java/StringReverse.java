package org.java;


import java.util.Arrays;
import java.util.Comparator;


public class StringReverse
{
	public String reverse(String stringToBeRev) 
	{	
		 String[] string= stringToBeRev.split("");
		 StringOperation a=new StringOperation();
		 Comparator<String> c = (a::compare);
	     Arrays.sort(string, c);
	     String reverseString=Arrays.toString(string).replaceAll(",", "").replaceAll(" ", "");	 
	     return reverseString;
	}
}