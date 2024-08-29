package com.xworkz.app.data;

public class Bag {
	
	private String name;
	private double price;
	private String color;
	public Bag(String name, double price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
public void wear()
{
	System.out.println("wear.....");
}

public void details()
{
	System.out.println("details...");
	System.out.println(name);
	System.out.println(price);
	System.out.println(color);
	
}
	
}
