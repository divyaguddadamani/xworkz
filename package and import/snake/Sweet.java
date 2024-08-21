package com.xworkz.snake;

public class Sweet {
	
	private String[] Sweet=new String[7];
	private int position=0;
	
	
	public void save(String sweet) {
		
		this.Sweet[position]=sweet;
		this.position++;
	}
	
	public void display()
	{
		for(String ref:Sweet)
		{
			System.out.println(ref);
		}
	}

}
