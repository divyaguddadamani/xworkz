class Paper{
	
	double thickness;
	String size;
	String quality;
	String color="black";
	
	public Paper(String size ){
		
		this.size=size;
	}
	
	public void setPaper(String quality){
		
		this.quality=quality;
	}
	
	public void print(){
		
		System.out.println("paper thickness:"+this.thickness);
		System.out.println("paper size:"+this.size);
		System.out.println("paper quality:"+this.quality);
		System.out.println("paper color:"+this.color);
		System.out.println("--------------------------");
		
	}
	
}


