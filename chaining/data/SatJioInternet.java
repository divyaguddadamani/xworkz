package com.xworkz.data;

public class SatJioInternet extends JioInternetProvider{
	
	private double cost;
	private String LaunchDate;
	
	public SatJioInternet(double cost,String LaunchDate,String name, String ceoName) {
		
		super(name, ceoName);
		this.cost=cost;
		this.LaunchDate=LaunchDate;
		
	}
	@Override
	public void service() {
		System.out.println("run Service in SatJioInternet");

}

}
