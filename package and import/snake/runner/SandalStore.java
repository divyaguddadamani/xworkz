package com.xworkz.snake.runner;

import com.xworkz.snake.Sandal;

public class SandalStore {
	
	private Sandal[] data=new Sandal[5];
	private  int index=0;
	
	public void save(Sandal info)
	{
		this.data[index]=info;
		index++;
		
	}
	
	public void print()
	{
		for (Sandal ref:data)
		{
			if(ref!=null) 
			{
			ref.run();
		}
			else
			{
			System.out.println("null pointer exception");
	}

}
}
}