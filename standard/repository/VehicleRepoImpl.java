package com.xworkz.standard.repository;

public class VehicleRepoImpl implements VehicleRepository {

	@Override
	public void save() {
		System.out.println("run save");
		
	}

	@Override
	public void update() {
		System.out.println("run update");
		
	}

	@Override
	public boolean delete() {
		System.out.println("run delete");
		return false;
	}

	@Override
	public String read() {
		System.out.println("run read");
		return null;
	}
	

}
