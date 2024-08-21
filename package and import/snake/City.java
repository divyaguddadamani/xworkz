package com.xworkz.snake;

public class City {

	private String[] City=new String[7];
	private int position=0;
	
	
	public void save(String city) {
		
		this.City[position]=city;
		this.position++;
	}
	
	public void display()
	{
		for(String ref:City)
		{
			System.out.println(ref);
		}
	}

	
}
