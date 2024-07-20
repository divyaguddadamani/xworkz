class Country{
	
	public static String nameOfCountry(int code){
		
	System.out.println("running nameOfCountry in country");
	
	if(code==91)
	{
		return "India";
	}
	if(code==7)
	{
		return "Russia";
	}
	if(code==1)
	{
		return "united state";
	}
	if(code==44)
	{
		return " United Kingdom";
	}
	if(code==20)
	{
		return "Egypt";
	}
	
	System.out.println("country doesnot defined");
		return "unknown country";
		
	}	
	public static double price(String item)
	{
		
	System.out.println("running price in country");
	
	if(item=="brush")
	{
		return 25;
	}
	if(item=="soap")
	{
		return 5;
	}
	if(item=="bucket")
	{
		return 199;
	}
	if(item=="plate")
	{
		return 80;
	}
	if(item=="charger")
	{
		return 250;
	}
	
	System.out.println("items are not there");
		return 0;
	
	}
	
	
	public static String ProducerName(String movieName)
	{
		
	System.out.println("running ProducerName in country");
	
	if(movieName=="kgf")
	{
		return "vijay kiragandur";
	}
	if(movieName=="kirik party")
	{
		return "rakshit shetty";
	}
	if(movieName=="mungaru male")
	{
		return "e krishnappa";
	}
	if(movieName=="rangitaranga")
	{
		return "prakash";
	}
	if(movieName=="Natasaarvabhowma")
	{
		return"rockline venkatesh";
	}
	
	System.out.println(" movie is not there in list");
		return "not mentioned";
	
	}
	
}
