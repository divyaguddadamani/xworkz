package com.xworkz.media;

public class HighwayTraffic {
	
	private TrafficRule trafficRule;

	
	public void setTrafficRule(TrafficRule trafficRule) {
		this.trafficRule = trafficRule;
	}



	public void stop()
	{
		if(trafficRule!=null)
		{
			trafficRule.licenceNo();
			System.out.println("ref is not null");

		}
		else
		{
			System.out.println("ref is null");
		}
	}
}
