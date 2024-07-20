class ChainRunner{
	public static void main(String[] args){
		System.out.println("running main in ChainRunner");
		
		int karat=Chain.karat();
		System.out.println("the gold karat:"+karat);
		double costPerGram=Chain.costPerGram();
		System.out.println("the gold cost:"+costPerGram);
		String typeOfGOld=Chain.type();
		System.out.println("the gold type:"+typeOfGOld);
		int quantity=Chain.quantity();
		System.out.println("the gold quantity in grams:"+quantity);
		String quality=Chain.quality();
		System.out.println("the gold quality is:"+quality);
		int wastage=Chain.wastage();
		System.out.println("the gold wastage in percentage:"+wastage);
		double serviceCharge=Chain.charge();
		System.out.println("the gold serviceCharge:"+serviceCharge);
		double GST=Chain.GST();
		System.out.println("the gold GST:"+GST);
		
		
		
		
	}
}