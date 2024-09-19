package com.xworkz.standard.repository;

public class MachineRepoImpl implements MachineRepository{

	@Override
	public void save() {
		System.out.println("run save.....");
		
	}

	@Override
	public int update() {
		System.out.println("run update.....");
		return 3;
	}

	@Override
	public int delete() {
		System.out.println("run delete.....");
		return 12;
	}

	@Override
	public int read() {
		System.out.println("run read.....");
		return 10;
	}

}
