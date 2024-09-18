package com.xworkz.media;

public class FoodSafetyDep{
	
	private HotelRule hotelrule;
	
	
	
	public void setHotelrule(HotelRule hotelrule) {
		this.hotelrule = hotelrule;
	}



	public void inspection()
	{
		System.out.println("run inspection in FoodSafetyDep");
		if(hotelrule!=null)
		{
			
			hotelrule.cleanPremises();
			System.out.println("method is not null");
			
		}
		else
		{
			System.out.println("method is  null....");
		}
	}

}
