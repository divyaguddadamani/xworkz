package com.xworkz.internal;

public class LocalMarket implements Market{

	@Override
	public String location() {
		System.out.println("run Location in LocalMarket");
		return null;
	}

	@Override
	public void bill() {
		System.out.println("run bill in LocalMarket");
		
	}

}
