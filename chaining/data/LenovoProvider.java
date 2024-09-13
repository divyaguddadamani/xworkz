package com.xworkz.data;

public class LenovoProvider extends Provider {
	
	private double profit;
	
	public LenovoProvider(double profit,String name, String ceoName) {
		super(name, ceoName);
		this.profit=profit;
		
	}
	

	@Override
	public String toString() {
		return "LenovoProvider [profit=" + profit + ", toString()=" + super.toString() + "]";
	}


	@Override
	public void service() {
		System.out.println("run service in LenovoProvider");		
	}
}
