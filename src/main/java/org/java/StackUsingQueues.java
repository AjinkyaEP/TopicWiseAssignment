/****************************************************************************************************************************
TITLE:- 	THIS CLASS CONSIST OF IMPLEMENTATION OF STACK USING QUEUES
AUTHOR:-	AJINKYA
DATE:-		26/02/2018


ALOGRITHM:-
FOR PUSH:
	If no element is present in the queue 
	{
		Add the element to queue
	}
	else
	{
		Copy all the element to temporary queue from original queue
		Add the given element to original queue
		Add all the elements from temporary queue to the original queue
	}
	
FOR POP:-
		If queue is empty throw the exception else print the queue
*******************************************************************************************************************************/
package org.java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;

public class StackUsingQueues 
{		   
	    /*  Function to push an element to the stack */
	    public Queue push(int data, Queue<Integer> queue)
	    {
	    	Queue<Integer> temporary = new LinkedList<Integer>();
	    	
	        /*If no element is present in queue then enqueue the new element into q*/         
	        if (queue.size() == 0)
	        {	
	        	queue.add(data);
	        	System.out.println("First data added successfully"); 
	        }
	        else
	        {
	            //If elements are present in queue then dequeue all the elements to temporary queue*/             
	            int sizeOfQueue = queue.size();
	            
	            for (int i = 0; i < sizeOfQueue; i++)
	            {
	            	temporary.add(queue.remove());
	            }
	            
	            /* Enqueue the new element into q */
	            queue.add(data);        
	            
	            /* Dequeue all the elements from temporary queue to queue */                 
	            for (int i = 0; i < sizeOfQueue; i++)
	            	queue.add(temporary.remove());
	        }
			return queue;
	    }   
	    
	    /*  Function to remove top element from the stack */
	    public Queue<Integer> pop(Queue<Integer> queue)
	    {
	        if (queue.size() == 0)
	            throw new NoSuchElementException("Underflow Exception");        
	        	queue.remove();
	        return queue;
	    } 
  
	    /*  Function to check the top element of the stack */
	    public int peek(Queue<Integer> queue)
	    {
	        if (queue.size() == 0)
	            throw new NoSuchElementException("Underflow Exception");            
	        return queue.peek();
	    } 
	    
	    
	    /*  Function to check if stack is empty */
	    public boolean isEmpty(Queue<Integer> queue)
	    {
	        return queue.size() == 0 ;
	    }
	    
	     
	    /*  Function to display the status of the stack */
	    public void display(Queue<Integer> queue)
	    {
	        System.out.print("\nStack = ");
	        int l = queue.size();
	        if (l == 0)
	            System.out.print("Empty\n");
	        else
	        {
	            Iterator it = queue.iterator();
	            while (it.hasNext())
	                System.out.print(it.next()+" ");
	            System.out.println();
	        }
	    }
	
	    //This method helps to implementstack using queue
	    public void implement()
	    {
	    	Queue<Integer> queue = new LinkedList<Integer>(); 
	        Scanner scan = new Scanner(System.in);     
	        
	        /* Perform Stack Operations */          
	        System.out.println("Stack Using Two Queues Test");  
	        char ch;     
	        do 
	        {
	            System.out.println("Enter the stack operation you need to perfom");
	            System.out.println("1. Push element");
	            System.out.println("2. Pop element");
	            System.out.println("3. Peek into the Stack");
	            System.out.println("4. Check whether Stack is empty");         
	            int choice = scan.nextInt();
	            switch (choice) 
	            {
	            case 1 : 
	                System.out.println("Enter integer element to push");
	                queue=push(scan.nextInt(),queue);                 
	                break;                          
	            case 2 : 
	                try
	                {
	                	queue=pop(queue);
	                    System.out.println("Successfully popped element from the Queue");
	                }
	                catch (Exception e)
	                {
	                    System.out.println("Error : " + e.getMessage());
	                }        
	                break;    
	                
	            case 3 : 
	                try
	                {
	                    System.out.println("Peek Element = "+ peek(queue) );
	                }
	                catch (Exception e)
	                {
	                    System.out.println("Error : " + e.getMessage());
	                }
	                break;   
	                
	            case 4 : 
	                System.out.println("Empty status = "+ isEmpty(queue) );
	                break;    
	                
	            default :  
	                System.out.println("Wrong Entry \n ");
	                break;
	            }
	            
	            /* Display Stack */        
	            display(queue);            
	            System.out.println("\nDo you want to continue (Type y or n) \n");
	            ch = scan.next().charAt(0);            
	        } while (ch == 'Y'|| ch == 'y');                 
	    }
	}

