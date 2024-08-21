package com.xworkz.snake;

public class BikeInfo {

	private String[] Bikeinfo=new String[7];
	private int indexNo=0;
	
	
    public void run(String Bikeinfo)
    {
    	this.Bikeinfo[indexNo]=Bikeinfo;
    	this.indexNo++;
    	
    }
    public void show()
    {
    	for (String bike:Bikeinfo)
    	{
    	System.out.println(bike);
    		
    }
	
	
}
}


