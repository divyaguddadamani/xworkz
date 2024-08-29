package com.xworkz.app.data;

public class Abhishek {
	
	private WashingMachine wash;
	
	
	
	public Abhishek(WashingMachine wash) {
		super();
		this.wash = wash;
	}



	public void clean()
	{
		if(wash!=null)
		{
			wash.rinse();
			wash.show();
		}
		else
		{
			System.out.println("wash is null");
		}
	}

}
