class ChocalateRunner{
	
	
	public static void main(String[] args){
		
		Chocalate ref=new Chocalate("vanilla");
		ref.size=200;
		ref.setchocalate(150.00);
		ref.display();
		
		Chocalate ref2=new Chocalate("strawbarry");
		ref2.size=300;
		ref2.brand="nestle";
		ref2.setchocalate(200.00);
		ref2.display();
		
		
		Chocalate ref3=new Chocalate("chocalate");
		ref3.size=400;
		ref3.brand="kitkat";
		ref3.setchocalate(300.00);
		ref3.display();
	}


}