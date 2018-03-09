package org.java;

public interface Interface1 
{
	default void log(String str)
	{
		System.out.println("Interface 1 logging::"+str);
	}
}
