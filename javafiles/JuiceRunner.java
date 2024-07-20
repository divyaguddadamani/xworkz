class JuiceRunner{

public static void juices(String name ,String brand,String flavour,double price ,int quantity )
{
	
	
 
  System.out.println("Name:"+name);
  System.out.println("Brand:"+brand);
  System.out.println("Flavour:"+flavour);
  System.out.println("Price:"+price);
  System.out.println("Quantity:"+quantity);
	
 
}

	public static void main(String[] args){
		
		System.out.println("run main in medicinerunner");
		
		if(args.length==5){
 String name= args[0];
 String brand=args[1];
 String flavour=args[2];
 String price=args[3];
 String quantity=args[4];
 
 
 double convertedPrice=Double.parseDouble(price);
  System.out.println("price:"+convertedPrice);
  
  int convertedQuantity=Integer.parseInt(quantity);
  System.out.println("Quantity:"+convertedQuantity);
		
		juices(name,brand,flavour,convertedPrice,convertedQuantity);
	}
}
}