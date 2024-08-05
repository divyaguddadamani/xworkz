class Task{
     static int panipuriPrice=20;
	static int KachoriPrice=15;
	static int AlooTikkiPrice=30;
	static int BhajiPrice=20;
	static int faludaPrice=60;
	
	public static int order(String chaat,String addItem){
		
		int totalAmount=0;
		if (chaat=="panipuri"){
			
			return panipuriPrice;
		}
		if (chaat=="panipuri"&& addItem=="Kachori"){
			
			totalAmount=panipuriPrice+KachoriPrice;
			return totalAmount;
		}
	    if (chaat=="panipuri"&&addItem=="Bhaji"){
			
			totalAmount=panipuriPrice+BhajiPrice;
			return  totalAmount;
		}
	     if (chaat=="panipuri"&&addItem=="AlooTikki"){
			 
			 totalAmount=panipuriPrice+AlooTikkiPrice;
			 return totalAmount;
			 
		 }
	     if (chaat=="panipuri"&&addItem=="faluda"){
			 
			 totalAmount=panipuriPrice+faludaPrice;
			 return totalAmount;
		 }
	     
	
	return totalAmount;
	}
	public static void main(String[] args){
		
		int totalAmount=order("panipuri","kachori");
		System.out.println(totalAmount);
		
	}


}