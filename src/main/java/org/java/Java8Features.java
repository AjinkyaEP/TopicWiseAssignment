/************************************************************************
TITLE:- ASSIGNMENT ON JAVA 8 FEATURE
AUTHOR:- AJINKYA CHUDIWAL
DATE:-26/02/2018
*************************************************************************/
package org.java;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Topic.wiseassignment.App;


public class Java8Features
{

	public void selectFeature() 
	{
		int option=0;
    	while(true) 
    	{
    		System.out.println("Please select the Java 8 feature you want to Explore");
	        System.out.println("1. forEachMethod() in Iterable interface");
	        System.out.println("2. Multiple Inheritance in classes using Interface");
	        System.out.println("3. Display current time in two different time zone");
	        System.out.println("4. Usage of :: method reference operator");
	        System.out.println("5. Implement Comparator interface and print the given string in reverse order");
	        System.out.println("Enter 6 to exit\n"); 
	        Scanner sc=new Scanner(System.in);
	        option=sc.nextInt();
	        
	        switch(option)
	        {
	        	case 1:	
	        			System.out.println("Collections");
	        			forEachDemo();
	        			break;
	        			
	        	case 2: 
    					System.out.println("This can be achieved using new Java 8 feature of Default Interface");
    					App app=new App();
    					app.log("Default Method from Interface");
    					break;
    			
	        	case 3: 
						System.out.println("Parsing current Date and Time");
						DateDemo time=new DateDemo();
						try 
						{
							time.displayTime();
						} 
						catch (ParseException e) 
						{
							e.printStackTrace();
						}
						break;
    				
	        	case 4:	
	        			IsNull value=Java8Features::isNullString;
	        			System.out.println("Enter String value which needs to be checked :-");
	        			Scanner getString=new Scanner(System.in);
	        			String string=getString.nextLine();
	        			boolean check=value.isNull(string);
	        			if (check)
	        				System.out.println("Value is null");
	        			else
	        				System.out.println("Value is not null");
	        			break;
	        			
	        	case 5:	StringReverse stringToRev=new StringReverse();
	        			System.out.println("Enter the string you want to reverse :-");
	        			Scanner getString1=new Scanner(System.in);
	        			String string1=getString1.nextLine();
	        			System.out.println("Given String is :"+string1);
	        			System.out.println("Reverse String is :"+stringToRev.reverse(string1));	        			
        				break;
	        			
	        	case 6:	
	        			System.out.println("Exiting the program");
	        			System.exit(0);
    					break;
    					
	        	default:System.out.println("Please enter valid option");
	    				break;        	
	        }
	    } 	
	}
	//Implement for each method in Java
	public void forEachDemo()
	{
		List<String> list=new ArrayList<String>();  
	       list.add("Ajinkya");         
	       list.add("Sonal");       
	       list.add("Akshay");         
	       list.add("EPAM");         
	       list.add("Tiger");                
	       list.forEach(          
	           // lambda expression        
	           (names)->System.out.println(names)         
	       );     
	}
	public static boolean isNullString(String str) 
	{
		System.out.println("Interface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
	
}
