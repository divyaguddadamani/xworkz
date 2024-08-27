package com.xworkz.principels.data;

public class Halwa {

	public String type;
	public int quantity;
	public double price;
	
	public Halwa()
	{
		System.out.println("created halwa cons with no arg ");
		
	}
	public void run() {
		
		System.out.println(type);
		System.out.println(quantity);
		System.out.println(price);
	}
	
	public void order()
	{
		System.out.println("run order in halwa class");
		
	}
		
}
