package com.xworkz.toothpast.data;

public class Toothpaste {
	
	private String company;
	private boolean salt;
	
	public Toothpaste(String company) {
		super();
		this.company = company;
	}

	public Toothpaste(String company, boolean salt) {
		super();
		this.company = company;
		this.salt = salt;
	}
	
	public void show()
	{
		System.out.println(company);
		System.out.println(salt);
	}

}
