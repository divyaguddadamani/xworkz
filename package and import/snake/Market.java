package com.xworkz.snake;

public class Market {
	
	String name;
	String location;
	
	public Market(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	
	public void run()
	{
		System.out.println(this.name);
		System.out.println(this.location);
		
	}
	

}
