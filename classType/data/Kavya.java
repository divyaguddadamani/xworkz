package com.xworkz.app.data;

public class Kavya {
	
	private Bag bag;
	public Kavya(Bag bag) {
		super();
		this.bag = bag;
	}
	public void storeCard()
	{
		if(bag!=null)
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
