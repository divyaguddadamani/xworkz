package com.xworkz.snake;

public class Snake {

	String name;
	int lenght;
	String type;
	
	
	public Snake(String name,int lenght,String type)
	{
		this.name=name;
		this.lenght=lenght;
		this.type=type;
		System.out.println("createed constructor with String and int");
		
	}
	public void run() {
		
		System.out.println("Name:"+this.name);
		System.out.println("length:"+this.lenght);
		System.out.println("type:"+this.type);
	}
}

