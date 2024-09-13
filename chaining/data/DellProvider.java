package com.xworkz.data;

public class DellProvider extends Provider {
	
	public DellProvider(String name, String ceoName) {
		super(name, ceoName);
	
	}
	@Override
	public void service() {
		System.out.println("run Service in DellProvider");
		
	}

}
