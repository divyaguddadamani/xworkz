package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.data.Darshan;
import com.xworkz.inheritance.data.Vehicle;
import com.xworkz.inheritance.data.deepak;
import com.xworkz.inheritance.data.kushi;

public class vehicleRunner {

	public static void main(String[] args) {
	
		Darshan darshu=new Darshan();
		darshu.milage();
		
		System.out.println("=============================");
		
		deepak deepu =new deepak();
		Vehicle vehicle=new Vehicle();
		deepu.engine(vehicle);
		
		System.out.println("=============================");
		
		
		kushi kush=new kushi();
		kush.vehicle=new Vehicle();
		kush.petrol();
		
		System.out.println("=============================");
		

	}

}
