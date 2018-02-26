package Topic.wiseassignment;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	int option=0;
        System.out.println("Please select the topic you want to check for Java and Java 8");
        System.out.println("1. Stack using Queues");
        System.out.println("2. Oops Concept for Car Class");
        System.out.println("3. Understand Object Level locking and Class level locking");
        System.out.println("4. What are Java releated changes for interfaces");
        System.out.println("5. What is double-checked locking?");
        System.out.println("6. What are the disadvantages of normal singleton design pattern implementation and ways to overcome the same.");
        System.out.println("7. Lambda expression usage:Adding values/data in application popup");
        Scanner sc=new Scanner(System.in);
        option=sc.nextInt();
        
        switch(option)
        {
        	case 1:	System.out.println("Implementing Stack using Queues");
        			StackUsingQueues SQ=new StackUsingQueues();
        			break;
        	case 2: Car car=new Car();
    				break;
        	case 3:
    				break;
        	case 4:
    				break;
        	case 5:
    				break;
        	case 6:
    				break;
        	case 7:
    				break;
        	case 8:
    				break;
    				
    		default:System.out.println("Please enter valid option");
    				break;        	
        }
    }
}
