package com.xworkz.implement;

import java.time.LocalTime;

import com.xworkz.media.RailwayStationRule;

public class BangaloreRailway implements RailwayStationRule {

	@Override
	public String name() {
		System.out.println("run name");
		return null;
	}

	@Override
	public boolean NoSmoking() {
		System.out.println("run NoSmoking");
		return false;
	}

	@Override
	public boolean Ticket() {
		System.out.println("run Ticket");
		return false;
	}

	@Override
	public int PlatformNumber() {
		System.out.println("run PlatformNumber");
		return 0;
	}

	@Override
	public double MaximumBaggage() {
		System.out.println("run MaximumBaggage");
		return 0;
	}

	@Override
	public LocalTime StartTimings() {
		System.out.println("run StartTimings");
		return null;
	}

	@Override
	public LocalTime EndTimings() {
		System.out.println("run EndTimings");
		return null;
	}

	@Override
	public int NoOfPassengers() {
		System.out.println("run NoOfPassengers");
		return 0;
	}

	@Override
	public double cost() {
		System.out.println("run cost");
		return 0;
	}

	@Override
	public boolean checkin() {
		System.out.println("run checkin");
		return false;
	}

	@Override
	public double fineOverweightBaggage() {
		System.out.println("run fineOverweightBaggage");
		return 0;
	}

	@Override
	public boolean QueueForTicket() {
		System.out.println("run QueueForTicket");
		return false;
	}

	@Override
	public LocalTime AnnouncementsTime() {
		System.out.println("run AnnouncementsTime");
		return null;
	}

	@Override
	public String OperatingHours() {
		System.out.println("run OperatingHours");
		return null;
	}

	@Override
	public int noOfTrains() {
		System.out.println("run noOfTrains");
		return 0;
	}

}
