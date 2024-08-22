package com.xworkz.snake.runner;

import com.xworkz.snake.Market;

public class MarketStore {
	
	private Market[] val=new Market[5];
	private int place=0;
	
	public  void store(Market details)
	{
		this.val[place]=details;
		place++;
		
	}
	
	public void print()
	{
		for (Market info:val)
		{
			if(info!=null)
			{
			info.run();
			}
			else
			{
				System.out.println("null pointer exception");
			}
		}
	}
	
	
	
	

}
