package com.xworkz.app.data;

public class Dboos {
	
	private Gun gun;

	
	public Dboos(Gun gun) {
		super();
		this.gun = gun;
	}


	public void shoot() 
	{
		if (gun != null) 
		{
			gun.fire();
			gun.display();

		} 
		else
		{
			System.out.println("gun is null");
		}
	}

}



