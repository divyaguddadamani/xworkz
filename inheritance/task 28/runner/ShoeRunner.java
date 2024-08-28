package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.data.Harshitha;
import com.xworkz.inheritance.data.Omkar;
import com.xworkz.inheritance.data.Shoe;
import com.xworkz.inheritance.data.divya;

public class ShoeRunner {

	public static void main(String[] args) {
		
		divya sg=new divya();
		sg.wear();
		
		System.out.println("=============================");
		
		Omkar om=new Omkar();
		Shoe shoe=new Shoe();
		om.walk(shoe);
		
		
		System.out.println("==============================");
		
		
		Harshitha harshitha=new Harshitha();
		harshitha.shoe=new Shoe();
		harshitha.fall();
		
		
		System.out.println("==============================");
		

	}

}
