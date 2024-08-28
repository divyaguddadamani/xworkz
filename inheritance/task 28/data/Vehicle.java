package com.xworkz.inheritance.data;

public class Vehicle {

	public String name="bullet";
	public  double price=250000;
	
	public Vehicle()
	{
		System.out.println("Vehicle");
	}
	
	public void drive() 
	{
		System.out.println("drive");

	}
	
	public void service() 
	{
		System.out.println("service");
	}
	public void license()
	{
		System.out.println("license");
	}
}
