class BikeshowRoom
{	
	public static int bikePrice(String name)
	{
		int bikeFristPrice=20000;
		int insurance=bikeFristPrice+1000;
	    int totalPrice=insurance+500;
		
		if( name=="bullet"){
			return totalPrice;
		}
		else
		{
			
		  return bikeFristPrice;
		
		}
	
			
		}
		
		
		public static void main(String[] args){
			
			System.out.println("run");
		     int bikePrice=bikePrice("bullet");
			 System.out.println(bikePrice);
			 
		}
	}
	
