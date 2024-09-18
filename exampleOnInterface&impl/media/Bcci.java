package com.xworkz.media;

public class Bcci  {

	private CricketRule cricketrule;
	
	public void setCricketRule(CricketRule cricketrule) {
		this.cricketrule=cricketrule;
	}

	public void check()
	{
		System.out.println("run check....");
		if(cricketrule!=null)
		{
			System.out.println("cricketRule is not null");
			
			
			cricketrule.powerplay();
		}
		else
		{
			System.out.println("cricketRule is  null");
		}
	}
}
