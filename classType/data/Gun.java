package com.xworkz.app.data;

public class Gun {
	
	private String name;
	private String countryMade;
	private String type;
	
	public Gun()
	{
		System.out.println("constructor with no para....");
		}

	public Gun(String name, String countryMade, String type) {
		this.name = name;
		this.countryMade = countryMade;
		this.type = type;
	}
	
	public void fire()
	{
		System.out.println("fire....");
	}
	
	public void display()
	{
		System.out.println("display....");
		System.out.println(name);
		System.out.println(countryMade);
		System.out.println(type);
		
	}

}
