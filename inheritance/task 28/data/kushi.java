package com.xworkz.inheritance.data;

public class kushi {
	public Vehicle vehicle;
	
	public void petrol()
	{
		if(vehicle!=null)
		{
			vehicle.drive();
			vehicle.license();
			vehicle.service();
			System.out.println(vehicle.price);
		}
		else
		{
			System.out.println("get null pointer exception");
		}
	}

}
