package com.xworkz.intrenal;

public class Board {
	
	private String material;
	private double cost;
	
	protected Board()
	{
		System.out.println("running parametrised constructor in board");
	}
	

	public Board(String material, double cost) {
		super();
		this.material = material;
		this.cost = cost;
	}
	

}









