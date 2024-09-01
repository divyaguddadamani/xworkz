package com.xworkz.toothpast.Runner;

import com.xworkz.toothpast.data.CentrlGovt;
import com.xworkz.toothpast.data.Govt;
import com.xworkz.toothpast.data.StateGovt;

public class GovtRunner {

	public static void main(String[] args) {
		
		StateGovt stateGovt=new StateGovt("karnataka", "Siddaramaiah", "G parameshwara", 224);
		stateGovt.vote();
		
		Govt stateGovt2=new Govt("karnataka", "Siddaramaiah", "G parameshwara", 224);
		stateGovt2.vote();
		
		System.out.println("=======================");
		
		CentrlGovt centrlGovt=new CentrlGovt("karnataka", "Siddaramaiah", "G parameshwara");
		centrlGovt.vote();
		
		Govt centrlGovt2=new Govt("karnataka", "Siddaramaiah", "G parameshwara");
		centrlGovt2.vote();

		
	}

}
