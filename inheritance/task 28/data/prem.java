package com.xworkz.inheritance.data;

public class prem {

	public void wash(WatterBottle bottle)
	{
		if(bottle!=null) 
		{
			bottle.empty();
			bottle.crush();
			bottle.fill();
			System.out.println(bottle.color);
			System.out.println(bottle.quantity);
		}
	}
	
}
