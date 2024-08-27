package com.xworkz.principels.data;

public class Chicken {
	public double weight;
	public String featherColor;
	public double price;
	public int eggProduction;
	public char gender;
	public int lifeSpan;
	public String Breed;
	public String beak;
	public String framName;
	public double farmProfit;
	
	
	public Chicken()
	{
		System.out.println("Chicken");
		
	}


	public Chicken(double weight, String featherColor, double price, int eggProduction, char gender, int lifeSpan,
			String breed, String beak, String framName, double farmProfit) {
		super();
		this.weight = weight;
		this.featherColor = featherColor;
		this.price = price;
		this.eggProduction = eggProduction;
		this.gender = gender;
		this.lifeSpan = lifeSpan;
		Breed = breed;
		this.beak = beak;
		this.framName = framName;
		this.farmProfit = farmProfit;
		
	}
	
	public void weight() {
		
	System.out.println(weight);
	}
	public void featherColor()
	{
		System.out.println(weight);
	}
	public void price()
	{
		System.out.println(price);
	}
	public void eggProduction()
	{
		System.out.println(eggProduction);
	}
	public void gender()
	{
		System.out.println(gender);
	}
	public void lifeSpan()
	{
		System.out.println(lifeSpan);
	}
	public void Breed()
	{
		System.out.println(Breed);
	}
	public void beak()
	{
		System.out.println(beak);
	}
	public void framName()
	{
		System.out.println(framName);
	}
	public void farmProfit()
	{
		System.out.println(farmProfit);
	}
	
	

	
}
