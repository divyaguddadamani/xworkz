package com.xworkz.implement;

import com.xworkz.media.HighwayTraffic;

public class CircleTraffic implements HighwayTraffic {
	
	public CircleTraffic() {
		System.out.println("no arg const");
	}

	@Override
	public String License() {
		System.out.println("run license");
		return null;
	}

	@Override
	public boolean Insurance() {
		System.out.println("run Insurance");
		return false;
	}

	@Override
	public boolean Seatbelt() {
		System.out.println("run Seatbelt");
		return false;
	}

	@Override
	public boolean Helmets() {
		System.out.println("run Helmets");
		return false;
	}

	@Override
	public String noPlates() {
		System.out.println("run noPlates");
		return null;
	}

	@Override
	public int AgeRestrictions() {
		System.out.println("run AgeRestrictions");
		return 0;
	}

	@Override
	public int SpeedLimits() {
		System.out.println("run license");
		return 0;
	}

	@Override
	public boolean TrafficSignals() {
		System.out.println("run TrafficSignals");
		return false;
	}

	@Override
	public boolean DrunkDriving() {
		System.out.println("run DrunkDriving");
		return false;
	}

	@Override
	public boolean Indicators() {
		System.out.println("run Indicators");
		return false;
	}

	@Override
	public boolean EmergencyVehicles() {
		System.out.println("run EmergencyVehicles");
		return false;
	}

	@Override
	public boolean SafeDistance() {
		System.out.println("run SafeDistance");
		return false;
	}

	@Override
	public boolean HonkingUnnecessarily() {
		System.out.println("run HonkingUnnecessarily");
		return false;
	}

	@Override
	public boolean ParkingRules() {
		System.out.println("run ParkingRules");
		return false;
	}

	@Override
	public double fine() {
		System.out.println("run fine");
		return 0;
	}

}
