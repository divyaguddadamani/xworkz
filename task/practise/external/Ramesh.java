package com.xworkz.external;

import com.xworkz.intrenal.Gun;
import com.xworkz.intrenal.Weapon;

public class Ramesh extends Weapon {
	
	
	public void use()
	{
		System.out.println("running use in Ramesh.,.,.,.,.,");
		
	}
	public void torisu()
	{
			Weapon weapon =new Weapon();
			weapon.fire();
			use();
			
		}
		public void show()
		{
			Gun gun =new Gun();
			gun.fire();
			gun.use();
		}
		
	
}
