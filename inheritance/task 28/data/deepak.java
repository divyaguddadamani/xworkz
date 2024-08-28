package com.xworkz.inheritance.data;

public class deepak {
	
	public void engine(Vehicle vehicle) 
	{
		if(vehicle!=null)
		{
			vehicle.drive();
			vehicle.license();
			vehicle.service();
			System.out.println(vehicle.name);
		}
		else 
		{
			System.out.println("get null pointer exception");
		}
		
	}

}
