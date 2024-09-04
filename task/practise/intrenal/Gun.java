package com.xworkz.intrenal;

public class Gun extends Weapon {
	
	@Override
	public void use()
	{
		System.out.println("running use in Gun.....");
		
	}
	
	public void fire()
	{
		System.out.println("running fire in Gun.......");
	}
	

	public void run()
	{
	fire();
	use();
	}
	
}
