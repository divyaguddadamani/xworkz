package com.xworkz.snake.runner;

import com.xworkz.snake.SideDish;

public class Dishes {
	
	private SideDish[] info=new SideDish[5];
	private int position=0;
	
	public void store(SideDish data)
	{
		this.info[position]=data;
		position++;
	}
	
	public void shows()
	{
		for (SideDish dish:info)
		{
			if(dish!=null)
			{
				dish.show();
				
			}
			else
			{
				System.out.println("null pointer exception");
			}
		}
	}

}
