package com.xworkz.data;

public class BookingProvider extends Provider{
	
	public BookingProvider(String name, String ceoName) {
		super(name, ceoName);
		
	}
	@Override
	public void service() {
		System.out.println("run Service in BookingProvider");
		
	}
		


}
