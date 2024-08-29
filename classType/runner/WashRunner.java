package com.xworkz.app.runner;

import com.xworkz.app.data.Abhishek;
import com.xworkz.app.data.Bhumika;
import com.xworkz.app.data.Laxmi;
import com.xworkz.app.data.Megha;
import com.xworkz.app.data.Nayana;
import com.xworkz.app.data.WashingMachine;

public class WashRunner {
	public static void main(String[] main) {
		
		
		Megha megha=new Megha();
		megha.dry();
		
		System.out.println("=============================");
		
		Nayana nayana=new Nayana();
		nayana.spin();
		
		System.out.println("=============================");
		
		
		Laxmi laxmi=new Laxmi();
		WashingMachine wash=new WashingMachine("Panasonic", "Washer-dryer combo", 40);
		laxmi.wash(wash);
		
		System.out.println("=============================");
		
		
		WashingMachine wash2=new WashingMachine("HP", "Washer-dryer combo", 10);
		Abhishek abhi=new  Abhishek(wash2);
		abhi.clean();
		
		System.out.println("=============================");
		
		Bhumika bumi=new Bhumika();
		bumi.removeStain();
		
		System.out.println("=============================");
		
	}

}
