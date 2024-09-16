package com.xworkz.media;

import java.time.LocalTime;

public interface RailwayStationRule {
	String name();

	boolean NoSmoking();

	boolean Ticket();

	int PlatformNumber();

	double MaximumBaggage();

	LocalTime StartTimings();

	LocalTime EndTimings();

	int NoOfPassengers();

	double cost();

	boolean checkin();

	double fineOverweightBaggage();

	boolean QueueForTicket();

	LocalTime AnnouncementsTime();

	String OperatingHours();

	int noOfTrains();

}
