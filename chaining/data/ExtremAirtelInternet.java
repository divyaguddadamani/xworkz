package com.xworkz.data;

public class ExtremAirtelInternet extends AirtelInternetProvider {
	
	public ExtremAirtelInternet(String name, String ceoName) {
		super(name, ceoName);
		
	}
	@Override
	public void service() {
		System.out.println("run Service in ExtremAirtelInternet");

}


}
