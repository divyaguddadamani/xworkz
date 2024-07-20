class Buy{
	public static void product(String brand,double price){
		System.out.println("running productin class Buy");
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
			if(  price>5000.55 &&   price<=50000.56){
				System.out.println("valid price");
			}
			else{
				System.out.println("invalid price");
			}
	}
	public static void product(String name, int quantity , String quality ,double price){
		System.out.println("running productin class Buy");
		System.out.println("Name:"+name);
		System.out.println("quality:"+quality);
		System.out.println("quantity:"+quantity);
		System.out.println("Price:"+price);
		
			if(  quantity>5 &&   quantity<=500){
				System.out.println("valid quantity");
			}
			else{
				System.out.println("invalid quantity");
			}
	}
	public static void bookMovieTicket(String name, int quantity , String theaterName ,double price){
		System.out.println("running bookMovieTicket in class Buy");
		System.out.println("Name:"+name);
		System.out.println("theaterName:"+theaterName);
		System.out.println("quantity:"+quantity);
		System.out.println("Price:"+price);
		
			if(  quantity>1 &&   quantity<=50){
				System.out.println("valid quantity");
			}
			else{
				System.out.println("invalid quantity");
			}
	}
	public static void buyEgg( int total , double pricePerEgg){
		System.out.println("running buyEgg in class Buy");
		System.out.println("Total:"+total);
		System.out.println("PricePerEgg:"+pricePerEgg);
		
		
			if(  pricePerEgg>50.00 &&   pricePerEgg<=500.00){
				System.out.println("valid PricePerEgg");
			}
			else{
				System.out.println("invalid PricePerEgg");
			}
	}
	public static void buyShampoo( int quantityInMl ,double price,String brand,String manfDate){
		System.out.println("running buyShampoo in class Buy");
		System.out.println("quantityInMl:"+quantityInMl);
		System.out.println("price:"+price);
		System.out.println("brand:"+brand);
		System.out.println("manfDate:"+manfDate);
		
			if(  quantityInMl>200 &&   quantityInMl<=1000){
				System.out.println("valid quantityInMl");
			}
			else{
				System.out.println("invalid quantityInMl");
			}
	}
	public static void buyCake( char size,String type,String flavour ,double cost,int quantity){
		System.out.println("running buyCake in class Buy");
		System.out.println("Size:"+size);
		System.out.println("type:"+type);
		System.out.println("flavour:"+flavour);
		System.out.println("cost:"+cost);
		System.out.println("quantity:"+quantity);

			if(  cost>300 &&   cost<=1000){
				System.out.println("valid cost");
			}
			else{
				System.out.println("invalid cost");
			}
	}
	public static void buyLaptop( String brand,int serialNo,double price,int batterycapacity, double screenSize,
	String os,int hardDiskSize,int ramSize){
		System.out.println("running buyLaptop in class Buy");
		System.out.println("brand:"+brand);
		System.out.println("serialNo:"+serialNo);
		System.out.println("price:"+price);
		System.out.println("batterycapacity:"+batterycapacity);
		System.out.println("screenSize:"+screenSize);
		System.out.println("os:"+os);
		System.out.println("hardDiskSize:"+hardDiskSize);
		System.out.println("ramSize:"+ramSize);
		

			if( screenSize>13.00 &&   screenSize<=17.00){
				System.out.println("valid screenSize");
			}
			else{
				System.out.println("invalid screenSize");
			}
	}
	public static void buySmartWatch( String brand,double price,int color ,char type,int mode){
		System.out.println("running buyCake in class Buy");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("color:"+color);
		System.out.println("type:"+type);
		System.out.println("mode:"+mode);

			if(  price>5000 &&   price<=50000){
				System.out.println("valid price");
			}
			else{
				System.out.println("invalid price");
			}
	}
	
}


















