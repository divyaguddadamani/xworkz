package com.xworkz.snake;

public class Sandal {
	
	
	String brand;
	char size;
	double cost;
	String color;
	
	
	public Sandal(String brand, char size, double cost, String color) {
		super();
		this.brand = brand;
		this.size = size;
		this.cost = cost;
		this.color = color;
	}
	
	public void run() {
		
		System.out.println("Bramd:"+brand);
		System.out.println("Size:"+size);
		System.out.println("Cost:"+cost);
		System.out.println("Color:"+color);
	}

}
