package com.xworkz.app.data;

public class WashingMachine {
	
	private String brand;
	private String type;
	private double capacity;
	
	
	public WashingMachine(String brand, String type, double capacity) {
		super();
		this.brand = brand;
		this.type = type;
		this.capacity = capacity;
	}
	
	public void rinse()
	{
		System.out.println("rinse....");
	}
	
	public void show()
	{
		System.out.println("show....");
		System.out.println(brand);
		System.out.println("type");
		System.out.println("capacity");
	}
	

}
