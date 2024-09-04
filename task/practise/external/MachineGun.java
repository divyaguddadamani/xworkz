package com.xworkz.external;

import com.xworkz.intrenal.Weapon;

public class MachineGun extends Weapon{
	
	public void use()
	{
		System.out.println("running use in MachineGun.,.,.,.,.,");
		
	}
	
	public void fire()
	{
		System.out.println("running fire in MachineGun.,.,.,.,");
	}

	public void shoot()
	{
		fire();
		use();
	}
}
