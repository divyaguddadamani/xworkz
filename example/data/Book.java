package com.xworkz.example.data;

public class Book {
	private String name;
	private double price;
	
	public Book(String name) {
		this.name = name;
	}

	public Book(String name, double price) {
		this(name);
		this.price = price;
	}
	
	public void show()
	{
		System.out.println(name);
		System.out.println(price);
	}

}
