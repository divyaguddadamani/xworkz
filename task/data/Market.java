package com.xworkz.toothpast.data;

public class Market {
	
	
	private String name;
	private String location;
	private int shops;
	private String type;
	
	
	public Market(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}


	public Market(String name, String location, int shops, String type) {
		super();
		this.name = name;
		this.location = location;
		this.shops = shops;
		this.type = type;
	}
	
	public void open()
	{
		System.out.println(name);
		System.out.println(location);
		System.out.println(shops);
		System.out.println(type);
		
	}

}
