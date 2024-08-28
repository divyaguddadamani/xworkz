package com.xworkz.inheritance.data;

public class Omkar {

	public void walk(Shoe shoe)
	{
		if(shoe!=null)
		{
			shoe.safeGuard();
			shoe.enhanceWalk();
			System.out.println(shoe.price);
		}
		else {
			System.out.println("null pointer exception");
		}
	}
	
}
