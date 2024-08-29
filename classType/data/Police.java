package com.xworkz.app.data;

public class Police {

	public void Ak47(Gun gun) {
		if (gun != null)
		{
			gun.fire();
			gun.display();
		}
		else 
		{
			System.out.println("gun is  null");
		}
	}
}
