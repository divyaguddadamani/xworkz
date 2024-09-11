package com.xworkz.example.data;

public class Shoe {
	public static int size;
	public static String color;
	
	//static block
	
	static {
		
		size=6;
		color="black";
		System.out.println("running static block in Shoe");
	}
	

}