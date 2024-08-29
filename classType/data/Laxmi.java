package com.xworkz.app.data;

public class Laxmi {
	
	public void wash(WashingMachine wash)
	{
		if(wash!=null)
		{
			wash.rinse();
			wash.show();
		}
		else
		{
			System.out.println("Wash is null");
		}
	}

}
