package Topic.wiseassignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;

public class StackUsingQueues 
{
		Queue<Integer> queue ;
	    Queue<Integer> temporary ;
	 
	    /* Constructor */
	    public StackUsingQueues()
	    {
	        queue = new LinkedList<Integer>();
	        temporary = new LinkedList<Integer>();
	    }    
	    
	    /*  Function to push an element to the stack */
	    public void push(int data)
	    {
	        /*If no element is present in queue then enqueue the new element into q*/         
	        if (queue.size() == 0)
	        {	
	        	temporary.add(data);
	        }
	        else
	        {
	            //If elements are present in queue then dequeue all the elements to temporary queue*/             
	            int l = queue.size();
	            
	            for (int i = 0; i < l; i++)
	            {
	            	temporary.add(queue.remove());
	            }
	            
	            /* Enqueue the new element into q */
	            queue.add(data);        
	            
	            /* Dequeue all the elements from temporary queue to queue */                 
	            for (int i = 0; i < l; i++)
	            	queue.add(temporary.remove());
	        }
	    }   
	    
	    /*  Function to remove top element from the stack */
	    public int pop()
	    {
	        if (queue.size() == 0)
	            throw new NoSuchElementException("Underflow Exception");        
	        return queue.remove();
	    } 
  
	    /*  Function to check the top element of the stack */
	    public int peek()
	    {
	        if (queue.size() == 0)
	            throw new NoSuchElementException("Underflow Exception");            
	        return queue.peek();
	    } 
	    
	    
	    /*  Function to check if stack is empty */
	    public boolean isEmpty()
	    {
	        return queue.size() == 0 ;
	    }
	    
	    
	    /*  Function to get the size of the stack */
	    public int getSize()
	    {
	        return queue.size();
	    }  
	    
	    
	    /*  Function to display the status of the stack */
	    public void display()
	    {
	        System.out.print("\nStack = ");
	        int l = getSize();
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
	


	    public void implement()
	    {
	        Scanner scan = new Scanner(System.in);     
	        
	        /* Perform Stack Operations */          
	        System.out.println("Stack Using Two Queues Test\n");  
	        char ch;     
	        do 
	        {
	            System.out.println("\nStack Operations");
	            System.out.println("1. push");
	            System.out.println("2. pop");
	            System.out.println("3. peek");
	            System.out.println("4. check empty");
	            System.out.println("5. size");            
	            int choice = scan.nextInt();
	            switch (choice) 
	            {
	            case 1 : 
	                System.out.println("Enter integer element to push");
	                push(scan.nextInt());                 
	                break;                          
	            case 2 : 
	                try
	                {
	                    System.out.println("Popped Element = "+ pop() );
	                }
	                catch (Exception e)
	                {
	                    System.out.println("Error : " + e.getMessage());
	                }        
	                break;                         
	            case 3 : 
	                try
	                {
	                    System.out.println("Peek Element = "+ peek() );
	                }
	                catch (Exception e)
	                {
	                    System.out.println("Error : " + e.getMessage());
	                }
	                break;                         
	            case 4 : 
	                System.out.println("Empty status = "+ isEmpty() );
	                break;                
	            case 5 : 
	                System.out.println("Size = "+ getSize() ); 
	                break;            
	            default :  
	                System.out.println("Wrong Entry \n ");
	                break;
	            }
	            
	            /* Display Stack */        
	            display();            
	            System.out.println("\nDo you want to continue (Type y or n) \n");
	            ch = scan.next().charAt(0);            
	        } while (ch == 'Y'|| ch == 'y');                 
	    }
	}

