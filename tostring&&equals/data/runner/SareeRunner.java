package com.xworkz.details.runner;

import com.xworkz.details.Saree;

public class SareeRunner {

	public static void main(String[] args) {
		
		Saree saree1= new Saree("embroidery", "satin soft silk", 4.5, 8.2, "white", 753);
		
		Saree saree2= new Saree("floral", "Georgette", 4.6, 8.3, "green", 246);
		
		boolean same=saree1.equals(saree2);
		System.out.println("LHS=RHS:"+same);

	}

}
