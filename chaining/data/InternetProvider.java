package com.xworkz.data;

public class InternetProvider extends Provider{
	
	public InternetProvider(String name, String ceoName) {
		super(name, ceoName);
		
	}
	@Override
	public void service() {
		System.out.println("run Service in InternetProvider");
		
	}

}
