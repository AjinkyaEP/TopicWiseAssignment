/************************************************************************
TITLE:- TOPIC WISE ASSIGNMENTS FOR JAVA, SELENIUM AND SPRING
AUTHOR:- AJINKYA
DATE:-26/02/2018
*************************************************************************/
package Topic.wiseassignment;

import java.util.Scanner;

import javax.annotation.Resource;

public class App implements Interface1, Interface2
{
    public static void main( String[] args )
    {
    	int option=0;
    	while(true) {
        System.out.println("Please select the topic for Java and Java 8");
        System.out.println("1. Stack using Queues");
        System.out.println("2. OOPs Concept for Car Class");
        System.out.println("3. What are Java 8 releated changes for interfaces?");
        System.out.println("4. Lambda expression usage:Adding values/data in application popup");
        System.out.println("5. Explore Java 8 features");
        System.out.println("Enter 6 to exit\n"); 
        Scanner sc=new Scanner(System.in);
        option=sc.nextInt();
        
        switch(option)
        {
        	case 1:	System.out.println("Implementing Stack using Queues");
        			StackUsingQueues SQ=new StackUsingQueues();
        			SQ.implement();
        			break;
        			
        	case 2: System.out.println("OOPS Concept for Car class");
        			//INHERITANCE
        			Car car=new Car();
        			
        			//ENCAPSULATION
        			String color=car.getCarColor();
        			System.out.println("\nENCAPSULATION\nColor of car is :"+color);
        			System.out.println("Above is an example of Encapsulation since above object property is private to Car class and could be retrieved only through its function.");
        			
        			//ABSTRACTION
        			car.startCar();
        			
        			//POLYMORPHISM
        			Vehicle anotherCar=new Car();
        			System.out.println("\nPOLYMORPHISM\nAbove is an example of Polymorphism since above object ANOTHER CAR is morphed to Car type from Vehicle");
    				break;
    				
        	case 3: System.out.println("There are mainly two changes related to Java 8 in Interfaces");
        			System.out.println("This include\n1.Introduction of Default Interface\n2.Introduction of Static Interface");
        			App app=new App();
        			app.log("Default Method from Interface");
        			System.out.println("Implementing Static interface");
        			boolean checkNull=Interface2.isNull("");
        			System.out.println("String is null");
    				break;
        	
        	case 4:	LambdaExpression exp=new LambdaExpression();
        			exp.addValues();
        			break;
        	
        	case 5:	Java8Features features=new Java8Features();
					features.selectFeature();
					break;
        			
        	case 6: System.exit(0);
					break;
					
    		default:System.out.println("Please enter valid option");
    				break;        	
        	}
    	} 
    }

	@Override
	public void log(String str) 
	{
		Interface1.super.log(str);
		System.out.println("Default Interace has been required to be over-rided");
	}
}

