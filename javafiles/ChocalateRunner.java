class ChocalateRunner{
	
	
	public static void main(String[] args){
		
		Chocalate ref=new Chocalate(100);
		ref.flavour="vanilla";
		ref.setchocalate(150.00);
		ref.display();
		
		Chocalate ref2=new Chocalate(200);
		ref2.flavour="strawbarry";
		ref2.brand="nestle";
		ref2.setchocalate(200.00);
		ref2.display();
		
		
		Chocalate ref3=new Chocalate(300);
		ref3.flavour="chocalate";
		ref3.brand="kitkat";
		ref3.setchocalate(300.00);
		ref3.display();
	}


}