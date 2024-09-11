package com.xworkz.example.data;

public final class Bag {
	
	private String material;
	private double price;
	
	public Bag(String material, double price) {
		super();
		this.material = material;
		this.price = price;
	}
	
	public void carry()
	{
		System.out.println("run carry in Bag....");
	}
	
	public final void store()
	{
		System.out.println("run store in Bag .....");
		
	}
	

}
