package com.xworkz.standard.runner;

import com.xworkz.standard.repository.AddressImpl;
import com.xworkz.standard.repository.AddressRepo;
import com.xworkz.standard.repository.MachineRepoImpl;
import com.xworkz.standard.repository.MachineRepository;
import com.xworkz.standard.repository.Repository;
import com.xworkz.standard.repository.RepositoryImpl;
import com.xworkz.standard.repository.VehicleRepoImpl;
import com.xworkz.standard.repository.VehicleRepository;
import com.xworkz.standard.service.AddressService;
import com.xworkz.standard.service.AddressServiceimpl;
import com.xworkz.standard.service.MachineServiceImpl;
import com.xworkz.standard.service.Service;
import com.xworkz.standard.service.Serviceimpl;
import com.xworkz.standard.service.VehicleImpl;
import com.xworkz.standard.service.VehicleService;

public class Runner {

	public static void main(String[] args) {
		Repository repo=new RepositoryImpl();
		Serviceimpl serve=new Serviceimpl();
		serve.setRepository(repo);
		String save=serve.push();
		System.out.println(save);
		
		System.out.println("=============================");
		
		AddressRepo AddressRepo=new AddressImpl();
		AddressServiceimpl addressServiceimpl=new AddressServiceimpl ();
		addressServiceimpl.setAddressRepo(AddressRepo);
		addressServiceimpl.push();
		addressServiceimpl.load();
		addressServiceimpl.refresh();
		addressServiceimpl.remove();
		
		
		System.out.println("=============================");
		
		VehicleRepository vehicleRepository=new VehicleRepoImpl();
		VehicleImpl vehicleImpl =new VehicleImpl();
		vehicleImpl.setVehicleRepository(vehicleRepository);
		vehicleImpl.persist();
		vehicleImpl.merge();
		vehicleImpl.clear();
		vehicleImpl.search();
			
		System.out.println("=============================");
		
		
		MachineRepository MachineRepository=new  MachineRepoImpl();
		MachineServiceImpl machineServiceImpl=new MachineServiceImpl();
		machineServiceImpl.setMachineRepository(MachineRepository);
		machineServiceImpl.delete();
		machineServiceImpl.update();
		machineServiceImpl.save();
		machineServiceImpl.read();
		
	}

}
