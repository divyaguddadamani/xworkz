package com.xworkz.internal;

public class Person {
	
	private String name;
	
	public Person(String name)
	{
		this .name=name;
	}
   
	public String getname()
	{
		System.out.println("read name");
		return "laxmi";
	}

	public void setname(String name)
	{
		this .name=name;
		System.out.println("modify name");
		
	}
}
