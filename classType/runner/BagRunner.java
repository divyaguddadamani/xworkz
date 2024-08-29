package com.xworkz.app.runner;

import com.xworkz.app.data.Appu;
import com.xworkz.app.data.Bag;
import com.xworkz.app.data.Kavya;
import com.xworkz.app.data.Neha;
import com.xworkz.app.data.Vidya;

public class BagRunner {

	public static void main(String[] args) {

		Neha neha=new Neha();
		neha.store();
		
		System.out.println("=============================");
		
		Vidya vidya =new Vidya();
		Bag bag=new Bag("Laptop bag", 1000, "black");
		vidya.storeCash(bag);
				
		System.out.println("=============================");
		
		
		Bag bag2=new Bag("Sling", 350, "purple");
		Kavya kavya=new Kavya(bag2);
		kavya.storeCard();

		System.out.println("=============================");
		
		Appu appu=new Appu();
		appu.storeCosmetic();
		
		System.out.println("=============================");

	}

}
