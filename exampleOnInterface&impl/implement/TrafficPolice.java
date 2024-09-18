package com.xworkz.implement;

import com.xworkz.media.TrafficRule;

public class TrafficPolice implements TrafficRule{

	@Override
	public String licenceNo() {
		System.out.println("run liceneNo in TrafficPolice");
		return null;
	}

}
