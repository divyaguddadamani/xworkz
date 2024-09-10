package com.xworkz.details;

public class Saree {

	private String type;
	private String fabric;
	private double length;
	private double width;
	private String color;
	private double price;
	
	public Saree(String type, String fabric, double length, double width, String color, double price) {
		super();
		this.type = type;
		this.fabric = fabric;
		this.length = length;
		this.width = width;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Saree [type=" + type + ", fabric=" + fabric + ", length=" + length + ", width=" + width + ", color="
				+ color + ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj!=null) {
			
			if(obj instanceof Saree) {
				
				Saree saree=(Saree)obj;
				System.out.println("use instanceof to convert subclass type into parent type");
		
				if(this.type.equals(saree.type) && this.color.equals(saree.color) &&this.price==saree.price)
				{
					System.out.println("check the two given ref are equal or not");
					return true;
				}
				else
				{
					System.out.println("both are not equals");
				}
			
			}
			else 
			{
				System.out.println("obj is null");
			}
		}
		return super.equals(obj);
	}
	
}
