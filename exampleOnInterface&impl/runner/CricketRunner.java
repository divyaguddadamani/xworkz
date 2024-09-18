package com.xworkz.runner;

import com.xworkz.implement.CanaraHotelRuleImp;
import com.xworkz.implement.KAcricketRule;
import com.xworkz.media.Bcci;
import com.xworkz.media.CricketRule;
import com.xworkz.media.FoodSafetyDep;
import com.xworkz.media.HotelRule;

public class CricketRunner {

	public static void main(String[] args) {
		CricketRule cricketRuler=new KAcricketRule();
		Bcci bcci=new Bcci();
		bcci.setCricketRule(cricketRuler);
		bcci.check();
		
		System.out.println("===========================");
		
		HotelRule hotelrule=new CanaraHotelRuleImp();
		FoodSafetyDep imp=new FoodSafetyDep();
		imp.setHotelrule(hotelrule);
		imp.inspection();
	
		
		

	}

}
