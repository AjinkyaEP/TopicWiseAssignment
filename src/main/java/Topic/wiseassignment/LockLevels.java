package Topic.wiseassignment;

public class LockLevels 
{
	public LockLevels()
	{
		System.out.println("Object level lock:-");
		System.out.println("Object level locking is mechanism when you want to synchronize a non-static method or non-static code block such that only one thread will be able to execute the code block on given instance of the class. This should always be done to make instance level data thread safe.");
		System.out.println("Class level lock:-");
		System.out.println("Class level locking prevents multiple threads to enter in synchronized block in any of all available instances on runtime. This means if in runtime there are 100 instances of DemoClass, then only one thread will be able to execute demoMethod() in any one of instance at a time, and all other instances will be locked for other threads. This should always be done to make static data thread safe.");
	}	
}

//Example of Object level locking
class DemoClass 
{ 
  public synchronized void demoMethod(){} 
} 

//Example of Class level locking
class AnotherDemoClass 
{ 
  public synchronized static void demoMethod(){} 
} 
