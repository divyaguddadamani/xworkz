package com.xworkz.standard.service;

import com.xworkz.standard.repository.MachineRepository;

public class MachineServiceImpl implements MachineService{
	
	private MachineRepository machineRepository;
	

	public void setMachineRepository(MachineRepository machineRepository) {
		this.machineRepository = machineRepository;
	}

	@Override
	public String save() {
		if(machineRepository!=null)
		{
			System.out.println("repo is not null");
			int store=machineRepository.delete();
			
			if(store<10)
			{
				System.out.println("store in repo");
				return "success";
				
			}
			else
			{
				System.out.println("repo is not stored");
				return "failure";
			}
		}
		return "issue";
	}

	@Override
	public String update() {
		if(machineRepository!=null)
		{
			System.out.println("repo is not null");
			int store=machineRepository.read();
			
			if(store<5)
			{
				System.out.println("store in repo");
				return "success";
				
			}
			else
			{
				System.out.println("repo is not stored");
				return "failure";
			}
		}
		return null;
	}

	@Override
	public String delete() {
		if(machineRepository!=null)
		{
			System.out.println("repo is not null");
			int store=machineRepository.update();
			
			if(store>5)
			{
				System.out.println("store in repo");
				return "success";
				
			}
			else
			{
				System.out.println("repo is not stored");
				return "failure";
			}
		}
		return null;
	}

	@Override
	public String read() {
		if(machineRepository!=null)
		{
			System.out.println("repo is not null");
			machineRepository.save();
			
		}
		return null;
	}

}
