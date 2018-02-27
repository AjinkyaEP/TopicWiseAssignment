/************************************************************************
TITLE:- ASSIGNMENT ON JAVA 8 FEATURE
AUTHOR:- AJINKYA
DATE:-26/02/2018
*************************************************************************/
package Topic.wiseassignment;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java8Features {

	public void selectFeature() 
	{
		int option=0;
    	while(true) 
    	{
    		System.out.println("Please select the Java 8 feature you want to Explore");
	        System.out.println("1. forEachMethod() in Iterable interface");
	        System.out.println("2. Multiple Inheritance in classes using Interface");
	        System.out.println("3. Display current time in two different time zone");
	        System.out.println("Enter 4 to exit\n"); 
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
				try {
					time.displayTime();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
						break;
    					
	        	case 4:	
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
}
