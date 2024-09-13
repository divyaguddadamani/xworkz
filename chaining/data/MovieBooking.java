package com.xworkz.data;

public class MovieBooking extends BookingProvider{

	public MovieBooking(String name, String ceoName) {
		super(name, ceoName);
		
	}
	public void book()
	{
		System.out.println("run book in MovieProvider");
	}
	
	public void cancle()
	{
		System.out.println("run cancle in MovieProvider");
		
	}
	@Override
	public void service() {
		System.out.println("run service in MovieBooking");
		super.service();
	}
}
