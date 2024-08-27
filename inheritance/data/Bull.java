package com.xworkz.principels.data;

public class Bull {
	
	public String place;
	public int runSpeed;
	public String horn;
	public double weight;
	public String color;

	public Bull()
	{
		System.out.println("Bull");
	}

	public Bull(String place, int runSpeed, String horn, double weight, String color) {
		super();
		this.place = place;
		this.runSpeed = runSpeed;
		this.horn = horn;
		this.weight = weight;
		this.color = color;
	}
	
	public void bullPlace()
	{
		System.out.println(place);
	}
	
	public void bullspeed()
	{
		System.out.println(runSpeed);
	}
	
	public void bullhorn()
	{
		System.out.println(horn);
	}
	
	public void bullweight()
	{
		System.out.println(weight);
	}
	
	public void bullcolor()
	{
		System.out.println(color);
	}
	
}
