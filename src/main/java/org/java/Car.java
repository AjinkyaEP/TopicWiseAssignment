/************************************************************************
TITLE:- APPLICATION OF OOP PRINCIPLE ON CAR OBJECT
AUTHOR:- AJINKYA
DATE:-26/02/2018
*************************************************************************/
package org.java;

public class Car extends Vehicle
{
	private String color="Dark Blue";
	public Car()
	{
		System.out.println("In Sub-class Car constructor");
		System.out.println("Above is an example of Inheritance, since superclass constructor is called first and then subclass constructor");
	}
	//Example of an Encapsulation
	public String getCarColor()
	{
		return color;
	}
	public void startCar()
	{
		System.out.println("\nABSTRACTION\nStarting Car...");
		System.out.println("Car has been started successfully");
		System.out.println("Above call to method is an example of Abstraction since all the components involved to start the car are not known but are present inside the method implementation");
	}
}
