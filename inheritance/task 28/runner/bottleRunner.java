package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.data.Gunashree;
import com.xworkz.inheritance.data.WatterBottle;
import com.xworkz.inheritance.data.osama;
import com.xworkz.inheritance.data.prem;

public class bottleRunner {

	
	public static void main(String[] args) {
		
		Gunashree guna=new Gunashree();
		guna.drink();

		System.out.println("=============================");
		
		prem prem1=new prem();
		WatterBottle bottle=new WatterBottle();
		prem1.wash(bottle);
		
		System.out.println("=============================");

		osama os =new osama();
		os.bottle=new WatterBottle();
		os.cook();
		
		System.out.println("=============================");

	}

}
