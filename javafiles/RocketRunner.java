class RocketRunner{
	
	
	public static void main(String[] args){
		
		Rocket rocket=new Rocket(100);
		rocket.noOfTrusters=6;
		rocket.setRocket(200);
		rocket.show();
		
		Rocket rocket1=new Rocket(200);
		rocket1.country="US";
		rocket1.noOfTrusters=7;
		rocket1.setRocket(300);
		rocket1.show();
		
		
		Rocket rocket2=new Rocket(300);
		rocket2.country="japan";
		rocket2.noOfTrusters=8;
		rocket2.setRocket(400);
		rocket2.show();
	}


}