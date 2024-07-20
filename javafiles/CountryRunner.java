class CountryRunner{
	
	public static void main(String[] args){
		
		System.out.println("running main in CuntryRunner");
		
		String nameOfCountry=Country.nameOfCountry(91);
		System.out.println("Name:"+nameOfCountry);
		
		 nameOfCountry=Country.nameOfCountry(44);
		System.out.println("Name:"+nameOfCountry);
		
		 nameOfCountry=Country.nameOfCountry(20);
		System.out.println("Name:"+nameOfCountry);
		
		 nameOfCountry=Country.nameOfCountry(1);
		System.out.println("Name:"+nameOfCountry);
		
		 nameOfCountry=Country.nameOfCountry(7);
		System.out.println("Name:"+nameOfCountry);
		
		 nameOfCountry=Country.nameOfCountry(2);
		System.out.println("Name:"+nameOfCountry);
		
		System.out.println("===============");
		
		double price=Country.price("brush");
		System.out.println("Name:"+price);
		
		price=Country.price("soap");
		System.out.println("Name:"+price);
		
		price=Country.price("bucket");
		System.out.println("Name:"+price);
		
		price=Country.price("plate");
		System.out.println("Name:"+price);
		
		price=Country.price("charger");
		System.out.println("Name:"+price);
		
		price=Country.price("phone");
		System.out.println("Name:"+price);
		
		System.out.println("===========");
		
		String ProducerName=Country.ProducerName("kgf");
		System.out.println("Name:"+ProducerName);
		
		 ProducerName=Country.ProducerName("kirik party");
		System.out.println("Name:"+ProducerName);
		
		 ProducerName=Country.ProducerName("mungaru male");
		System.out.println("Name:"+ProducerName);
		
		 ProducerName=Country.ProducerName("rangitaranga");
		System.out.println("Name:"+ProducerName);
		
		 ProducerName=Country.ProducerName("Natasaarvabhowma");
		System.out.println("Name:"+ProducerName);
		
		 ProducerName=Country.ProducerName("Appu");
		System.out.println("Name:"+ProducerName);
		
		
	}
}