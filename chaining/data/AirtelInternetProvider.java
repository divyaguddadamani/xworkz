package com.xworkz.data;

public class AirtelInternetProvider extends InternetProvider {
	
	public AirtelInternetProvider(String name, String ceoName) {
		super(name, ceoName);
		
	}
	@Override
	public void service() {
		System.out.println("run Service in AirtelInternetProvider");

}
}
