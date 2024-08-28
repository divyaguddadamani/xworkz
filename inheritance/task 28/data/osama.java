package com.xworkz.inheritance.data;

public class osama {
	
	public WatterBottle bottle;
	
	public void cook()
	{
		if (bottle!=null)
		{
			bottle.crush();
			bottle.empty();
			bottle.fill();
			System.out.println(bottle.quantity);
		}
		else
		{
			System.out.println("null pointer exception");
		}
	}

}
