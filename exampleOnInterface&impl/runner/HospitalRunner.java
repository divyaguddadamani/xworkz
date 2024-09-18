package com.xworkz.runner;

import com.xworkz.implement.AitmClg;
import com.xworkz.implement.BangaloreRailway;
import com.xworkz.implement.CircleTraffic;
import com.xworkz.implement.KLEHospital;
import com.xworkz.implement.LaxmiTemple;
import com.xworkz.implement.SBIBank;
import com.xworkz.media.BankRule;
import com.xworkz.media.HighwayTraffic;
import com.xworkz.media.RailwayStationRule;

public class HospitalRunner {
	public static void main(String[] args) {

		KLEHospital kle = new KLEHospital();
		kle.doctorFees();
		kle.noOfAmbulance();
		kle.noOfBed();

		System.out.println("====================================");

		HighwayTraffic highway = new CircleTraffic();
		highway.AgeRestrictions();
		highway.DrunkDriving();
		highway.EmergencyVehicles();
		highway.fine();
		highway.Helmets();
		highway.HonkingUnnecessarily();
		highway.Indicators();
		highway.Insurance();
		highway.License();
		highway.noPlates();
		highway.Seatbelt();
		highway.TrafficSignals();
		highway.SpeedLimits();
		highway.SafeDistance();
		highway.ParkingRules();

		System.out.println("====================================");

		AitmClg aitm = new AitmClg();
		aitm.age();
		aitm.Attendance();
		aitm.cgpa();
		aitm.CreditsPoints();
		aitm.Email();
		aitm.Fee();
		aitm.idcard();
		aitm.LibraryBookLimit();
		aitm.LibraryFine();
		aitm.NoMobileinClass();

		System.out.println("====================================");

		LaxmiTemple laxmi = new LaxmiTemple();
		laxmi.ClosingTime();
		laxmi.donationamount();
		laxmi.OpeningTime();
		laxmi.Photography();
		laxmi.PoojaTimings();
		laxmi.QueueforDarshan();
		laxmi.RemoveFootwear();
		laxmi.Silence();
		laxmi.TempleName();
		laxmi.visitor();

		System.out.println("====================================");

		BangaloreRailway railway = new BangaloreRailway();
		railway.AnnouncementsTime();
		railway.checkin();
		railway.cost();
		railway.EndTimings();
		railway.fineOverweightBaggage();
		railway.MaximumBaggage();
		railway.name();
		railway.NoOfPassengers();
		railway.noOfTrains();
		railway.Ticket();
		railway.NoSmoking();
		railway.OperatingHours();
		railway.PlatformNumber();
		railway.QueueForTicket();
		railway.StartTimings();

		System.out.println("====================================");

		BankRule bank = new SBIBank();
		bank.AccountNumber();
		bank.atmNo();
		bank.Balance();
		bank.CreditLimit();
		bank.ifscCode();
		bank.name();
		bank.openingHours();
		bank.Savings();
		bank.TransactionFee();
		bank.WithdrawalLimit();

	}

}
