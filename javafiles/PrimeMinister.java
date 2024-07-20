

class PrimeMinisterRunner{

public static void primeMinName(String[] pm){
	
	System.out.println("start main");
	
	for(int start=0;start<pm.length;start++){
	
	String ref= pm[start];
	System.out.println("Prime minister name:"+ref);
	}
	for(int start=pm.length-1;start>=0;start--){
	
	String ref= pm[start];
	System.out.println("Prime minister name:"+ref);
	}


}
public static void main(String[] args){
	
	System.out.println("run main method ");
	
	String[] primeMinisterName={
			"Jawaharlal Nehru (1947–1964)",
			"Gulzarilal Nanda (1964, 1966 - Acting)",
			"Lal Bahadur Shastri (1964–1966)",
			"Indira Gandhi (1966–1977, 1980–1984)",
			"Morarji Desai (1977–1979)",
			"Charan Singh (1979–1980)",
			"Rajiv Gandhi (1984–1989)",
			"Vishwanath Pratap Singh (1989–1990)",
			"Chandra Shekhar (1990–1991)",
			"P. V. Narasimha Rao (1991–1996)",
			"Atal Bihari Vajpayee (1996, 1998–2004)",
			"H. D. Deve Gowda (1996–1997)",
			"I. K. Gujral (1997–1998)",
			"Manmohan Singh (2004–2014)",
			"Narendra Modi (2014–present)"};	
	
	primeMinName(primeMinisterName);
	
}


}