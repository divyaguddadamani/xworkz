class BuyRunner{
	
	public static void main(String[] args){
		
		System.out.println("running main method in BuyRunning");
		Buy.product("Zara",500);
        Buy.product("Zara",10000);
		Buy.product("ckicken",50,"good",500.00);
		Buy.product("ckicken",4,"good",500.00);
		Buy.bookMovieTicket("Kalki",5,"blockboster",300.00);
		Buy.bookMovieTicket("ckicken",500,"blockboster",500.00);
		Buy.buyEgg(6,42.52);
		Buy.buyEgg(122,400.25);
		Buy.buyShampoo(100,150.20,"clinic","4 july 2024");
		Buy.buyShampoo(500,550.00,"dove","8 july 2024");
		Buy.buyCake('M',"honey cake","vanilla",400,1);
		Buy.buyCake('l',"pastry","chocolate",1500,1);
		Buy.buyLaptop("HP",11,65000.10,4000,14.7,"windows",1,4);
		Buy.buyLaptop("HP",11,65000.10,4000,13.00,"windows",500,4);
		Buy.buySmartWatch("apple",10000,111,'s',15);
		Buy.buySmartWatch("apple",3000,111,'s',15);
		Buy.product("Lee",500);
		Buy.product("Zara",-200);


	}
}