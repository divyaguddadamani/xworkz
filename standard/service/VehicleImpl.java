package com.xworkz.standard.service;

import com.xworkz.standard.repository.VehicleRepository;

public class VehicleImpl implements VehicleService {

	private VehicleRepository vehicleRepository;

	public void setVehicleRepository(VehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;
	}

	@Override
	public String persist() {
		if (vehicleRepository != null) {
			System.out.println("repo is not null");
			boolean store = vehicleRepository.delete();

			if (store) {
				System.out.println("store in repo");
				return "success";

			} else {
				System.out.println("repo is not stored");
				return "failure";
			}
		}
		return null;
	}

	@Override
	public String merge() {

		if (vehicleRepository != null) {
			System.out.println("repo is not null");
			String store = vehicleRepository.read();

			if (store != null) {
				System.out.println("store in repo");
				return "success";

			} else {
				System.out.println("repo is not stored");
				return "failure";
			}
		}
		return null;
	}

	@Override
	public String clear() {

		if (vehicleRepository != null) {
			System.out.println("repo is not null");
			vehicleRepository.update();

		} else {
			System.out.println("repo is  null");
		}
		return null;

	}

	@Override
	public String search() {

		if (vehicleRepository != null) {
			System.out.println("repo is not null");
			vehicleRepository.save();
			;

		}

		else {
			System.out.println("repo is  null");
		}
		return null;
	}

}
