package com.xworkz.details.runner;

import com.xworkz.details.Kettle;

public class KettleRunner {

	public static void main(String[] args) {
		
		Kettle kettle1=new Kettle("Prestige", "steel", 500, 1500, 1500, true);
		
		Kettle kettle2=new Kettle("Prestige", "steel", 500, 1500, 1500, true);
		
		boolean same=kettle2.equals(kettle2);
		System.out.println("LHS=RHS:"+same);

	}

}