package com.xworkz.data;

public class BookMyShow extends MovieBooking{
	private int totalHalls;

	public BookMyShow(int totalHalls, String name, String ceoName) {
		super(name, ceoName);
		this.totalHalls=totalHalls;
		
	}
	@Override
	public void book() {
		System.out.println("run book in BookMyShow.....");
		
	}
	
	@Override
	public void cancle() {
		System.out.println("run cancle in BookMyShow......");
		
	}
	@Override
	public void service() {
		System.out.println("run service in BookMyShow.......");
		
	}
	@Override
	public String toString() {
		return "BookMyShow [totalHalls=" + totalHalls + ", toString()=" + super.toString() + "]";
	}
	
	
}
