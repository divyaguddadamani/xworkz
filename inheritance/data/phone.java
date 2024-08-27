package com.xworkz.principels.data;

public class phone {

	public String name;
	public double price;
	public int storage;
	public double display;
	
	public phone()
	{
		System.out.println(" const phone");
	}
	
	public phone(String name, double price, int storage, int display) {
		super();
		this.name = name;
		this.price = price;
		this.storage = storage;
		this.display = display;
	}

	public void print()
	{
		System.out.println(name);
		System.out.println(price);
		System.out.println(storage);
		System.out.println(display);
	}
	
	
}
