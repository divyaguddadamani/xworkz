package com.xworkz.media;

public interface TrafficRule {

	String License();

	boolean Insurance();

	boolean Seatbelt();

	boolean Helmets();

	String noPlates();

	int AgeRestrictions();

	int SpeedLimits();

	boolean TrafficSignals();

	boolean DrunkDriving();

	boolean Indicators();

	boolean EmergencyVehicles();

	boolean SafeDistance();

	boolean HonkingUnnecessarily();

	boolean ParkingRules();

	double fine();
}
