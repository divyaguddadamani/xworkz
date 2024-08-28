package com.xworkz.inheritance.data;

public class Harshitha {
	public Shoe shoe;

	public void fall()
	{
		if(shoe!=null)
		{
			shoe.safeGuard();
			shoe.enhanceWalk();
			System.out.println(shoe.price);
			System.out.println(shoe.brand);
		}
		else {
			System.out.println("null pointer exception");
		}
	}
		
		
	}

