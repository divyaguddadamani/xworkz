class Rocket{
	
	String country="India";
	int speed;
	int fuelCpacity;
	int noOfTrusters;
	
	
	Rocket(int speed ){
		this.speed=speed;
		
	}


	void setRocket(int fuelCpacity){
		this.fuelCpacity=fuelCpacity;
	}
	
	void show(){
		
		System.out.println("Rocket country:"+this.country);
		System.out.println("Rocket speed:"+this.speed);
		System.out.println("Rocket fuelCpacity:"+this.fuelCpacity);
		System.out.println("Rocket noOfTrusters:"+this.noOfTrusters);
		
	}

}