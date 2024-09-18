package com.xworkz.media;

public class GovtPg {
	private PgRule pgRule;

	
	public void setPgRule(PgRule pgRule) {
		
		this.pgRule = pgRule;
	}
	
	public void rent()
	{
		if(pgRule!=null)
		{
			System.out.println("rent is not null");
			pgRule.wifi();
		}
		else 
		{
			System.out.println("rent is null");
		}
	}
	
	

}
