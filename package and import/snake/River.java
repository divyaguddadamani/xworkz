package com.xworkz.snake;

public class River {

	private String[] River=new String[7];
	private int index=0;
	
	
	public void save(String river) {
		
		this.River[index]=river;
		this.index++;
	}
	
	public void print()
	{
		for(String ref:River)
		{
			System.out.println(ref);
		}
	}
}
