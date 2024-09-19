package com.xworkz.standard.repository;

public class AddressImpl  implements AddressRepo{

	@Override
	public boolean save() {
		System.out.println("run save in addressImpl");
		return false;
	}

	@Override
	public int update() {
		System.out.println("run update in addressImpl");
		return 5;
	}

	@Override
	public void delete() {
		System.out.println("run delete in addressImpl");
		
	}

	@Override
	public String read() {
		System.out.println("run read in addressImpl");
		return null;
	}

}
