package com.xworkz.runner;

import com.xworkz.implement.LuluMall;
import com.xworkz.implement.PriyaPg;
import com.xworkz.implement.TrafficPolice;
import com.xworkz.media.GovtPg;
import com.xworkz.media.HighwayTraffic;
import com.xworkz.media.LocalMall;
import com.xworkz.media.MallRule;
import com.xworkz.media.PgRule;
import com.xworkz.media.TrafficRule;

public class Runner {

	public static void main(String[] args) {
	
		TrafficRule trafficRule=new TrafficPolice();
		HighwayTraffic highwayTraffic=new HighwayTraffic();
		highwayTraffic.setTrafficRule(trafficRule);
		highwayTraffic.stop();
		
		System.out.println("==============");
		
		MallRule mallRule=new LuluMall();
		LocalMall localMall=new LocalMall();
		localMall.setMallRule(mallRule);
		localMall.bill();

		System.out.println("==============");
		
		PgRule pgRule=new PriyaPg();
		GovtPg govtPg =new GovtPg();
		govtPg.setPgRule(pgRule);
		govtPg.rent();
		
		System.out.println("==============");
	}

}
