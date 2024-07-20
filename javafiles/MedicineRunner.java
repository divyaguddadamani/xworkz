class MedicineRunner{

public static void medicine(String name ,String manfDate,double price ,int quantity )
{

  System.out.println("Name:"+name);
  System.out.println("ManfDate:"+manfDate);
  System.out.println("Price:"+price);
  System.out.println("Quantity:"+quantity);
  
 
}

	public static void main(String[] args){
		
		System.out.println("run main in medicinerunner");
		
			if(args.length==4){
		 String name= args[0];
		 String manfDate=args[1];
		 String price=args[2];
		 String quantity=args[3];
				
				
		double convertedPrice=Double.parseDouble(price);
        System.out.println("price:"+convertedPrice);
  
        int convertedQuantity=Integer.parseInt(quantity);
        System.out.println("Quantity:"+convertedQuantity);
        
		medicine(name,manfDate,convertedPrice,convertedQuantity);
	}
	
	}
}