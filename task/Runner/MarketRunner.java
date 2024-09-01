package com.xworkz.toothpast.Runner;

import com.xworkz.toothpast.data.Market;
import com.xworkz.toothpast.data.OnlineMarket;
import com.xworkz.toothpast.data.SuperMarket;

public class MarketRunner {

	public static void main(String[] args) {
		
		SuperMarket superMarket=new SuperMarket("pooja", "rajajinagar");
		superMarket.open();
		
		Market superMarket2=new Market ("pooja", "rajajinagar");
		superMarket2.open();
		
		System.out.println("=========================");
		
		
		OnlineMarket onlineMarket=new OnlineMarket("laxmi", "gokak", 2, "medical");
		onlineMarket.open();
		
		Market onlineMarket2=new Market("laxmi", "gokak", 2, "medical");
		onlineMarket2.open();

	}

}
