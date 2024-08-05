class Speaker{
	
	String brand;
	int size;
	String color="black";
	int output;
	
	
	public void display()
	{
		System.out.println("brand:"+this.brand);
		System.out.println("size:"+this.size);
		System.out.println("color:"+this.color);
		System.out.println("output:"+this.output);
	}
	
	public void setbrand(String brand)
	{
		this.brand=brand;
	}
	
	Speaker(int output)
	{
		this.output=output;
	}
	
	
}