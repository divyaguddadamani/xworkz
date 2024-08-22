package com.xworkz.snake;

public class SideDish {

	String name;
	double price;
	String type;
	public SideDish(String name, double price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}
	public void show()
	{
		System.out.println(name);
		System.out.println(price);
		System.out.println(type);
		
	}
}
