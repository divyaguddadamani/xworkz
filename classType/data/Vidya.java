package com.xworkz.app.data;

public class Vidya {

	public void storeCash(Bag bag)
	{
		if (bag!=null) 
		{
			bag.wear();
			bag.details();
		}
		else
		{
			System.out.println("bag is null");
		}
	}
}
