package com.xworkz.details.runner;

import com.xworkz.details.Jeans;

public class JeansRunner {

	public static void main(String[] args) {
		
		Jeans jeans1=new Jeans("wide leg jeans", "black", 750, 30, "denim", 2);
		
		Jeans jeans2=new Jeans("mom fit jeans", "white", 650, 30, "denim", 5);
		
		boolean same= jeans2.equals(jeans1);
		
		System.out.println("LHS==RHS:"+same);

		
	}

}
