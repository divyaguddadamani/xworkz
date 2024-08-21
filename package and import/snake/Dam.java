package com.xworkz.snake;

public class Dam {
	private String[] Dam=new String[8];
	private int index=0;
	
	
	public void save(String dam) {
		
		this.Dam[index]=dam;
		this.index++;
	}
	
	public void print()
	{
		for(String ref:Dam)
		{
			System.out.println(ref);
		}
	}

}
