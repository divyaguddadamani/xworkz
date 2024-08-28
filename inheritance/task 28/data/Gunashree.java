package com.xworkz.inheritance.data;

public class Gunashree {
	
	public void drink()
	{
		WatterBottle bottle=new WatterBottle();
		bottle.fill();
		bottle.crush();
		bottle.empty();
		System.out.println(bottle.color);
	}

}
