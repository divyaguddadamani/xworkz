class Chocalate{
	
	String brand="dairy milk";
	int size;
	String flavour ;
	double price;
	
	
	Chocalate(String flavour ){
		this.flavour=flavour;
		
	}

	void setchocalate(double price){
		this.price=price;
	}
	
	void display(){
		
		System.out.println(" BRAND:"+this.brand);
		System.out.println(" SIZE:"+this.size);
		System.out.println(" FLAVOUR:"+this.flavour);
		System.out.println(" PRICE:"+this.price);
		
	}

}