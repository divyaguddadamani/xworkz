package com.xworkz.dataRunner;

import com.xworkz.data.AirtelInternetProvider;
import com.xworkz.data.BookMyShow;
import com.xworkz.data.BookingProvider;
import com.xworkz.data.DellProvider;
import com.xworkz.data.ExtremAirtelInternet;
import com.xworkz.data.Fast5gExtreme;
import com.xworkz.data.InternetProvider;
import com.xworkz.data.JioInternetProvider;
import com.xworkz.data.LenovoProvider;
import com.xworkz.data.MovieBooking;
import com.xworkz.data.SatJioInternet;


public class ProviderRunner {

	public static void main(String[] args) {
		
		
		BookingProvider bookingProvider1 =new BookingProvider("divya", "vikas");
		BookingProvider bookingProvider2=new BookingProvider("laxmi", "tafseen");
		
		boolean store1=bookingProvider2.equals(bookingProvider1);
		System.out.println(store1);
		
		System.out.println(bookingProvider2.toString());
		
		bookingProvider1.service();
	
		System.out.println("==========================================================");
		
		MovieBooking movieBooking=new MovieBooking("deepak", "divya");
		
		boolean store2=movieBooking.equals(movieBooking);
		System.out.println(store2);
		
		System.out.println(movieBooking.toString());
		
		movieBooking.service();
		
		System.out.println("=====================================================");
		
		BookMyShow bookMyShow =new BookMyShow(250,"kalpana", "shrikant");
		
		boolean store3=bookMyShow.equals(bookMyShow);
		System.out.println(store3);
		
		System.out.println(bookMyShow.toString());
		
		bookMyShow.service();
		
		
		System.out.println("========================================================");
		
		DellProvider dellProvider=new DellProvider("darshan", "deepak");
		
		boolean store4=dellProvider.equals(bookingProvider1);
		System.out.println(store4);
		
		System.out.println(dellProvider.toString());

		dellProvider.service();
		
		System.out.println("========================================================");
		
		LenovoProvider lenovoProvider =new LenovoProvider(25, "kushi", "rishi");
		
		boolean store5=lenovoProvider.equals(bookMyShow);
		System.out.println(store5);
		
		System.out.println(lenovoProvider.toString());

		lenovoProvider.service();
		
		System.out.println("========================================================");
		
		InternetProvider internetProvider=new InternetProvider("vihan", "madhu");
		
		boolean store6=internetProvider.equals(internetProvider);
		System.out.println(store6);
		
		System.out.println(internetProvider.toString());

		internetProvider.service();
		
		System.out.println("========================================================");
		
		AirtelInternetProvider airtelInternetProvider =new AirtelInternetProvider("arun", "kiran");
		
		boolean store7=airtelInternetProvider.equals(lenovoProvider);
		System.out.println(store7);
		
		System.out.println(airtelInternetProvider.toString());

		airtelInternetProvider.service();
		
		System.out.println("========================================================");
		
		JioInternetProvider JioInternetProvider=new JioInternetProvider("mamatha", "pooja");
		
		boolean store8=JioInternetProvider.equals(airtelInternetProvider);
		System.out.println(store8);
		
		System.out.println(JioInternetProvider.toString());

		JioInternetProvider.service();
		
		System.out.println("========================================================");
		
		ExtremAirtelInternet extremAirtelInternet=new ExtremAirtelInternet("bhagya", "varun");
		
		boolean store9=extremAirtelInternet.equals(airtelInternetProvider);
		System.out.println(store9);
		
		System.out.println(extremAirtelInternet.toString());

		extremAirtelInternet.service();
		
		System.out.println("========================================================");
		
		Fast5gExtreme fast5gExtreme=new Fast5gExtreme("rani", "vani");
		
		boolean store10=fast5gExtreme.equals(fast5gExtreme);
		System.out.println(store10);
		
		System.out.println(fast5gExtreme.toString());

		fast5gExtreme.service();
		
		System.out.println("========================================================");
		
		SatJioInternet satJioInternet=new SatJioInternet(12563, "nov 25", "vani", "vinutha");
		
		boolean store11=satJioInternet.equals(fast5gExtreme);
		System.out.println(store11);
		
		System.out.println(satJioInternet.toString());

		satJioInternet.service();
		
		System.out.println("========================================================");
		
		
		
	}

}
