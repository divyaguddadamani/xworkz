package com.xworkz.toothpast.data;

public class Govt {
	
	private String state;
	private String partyHead;
	private String HM;
	private int noOfMLA;
	
	
	
	public Govt(String state, String partyHead, String hM, int noOfMLA) {
		super();
		this.state = state;
		this.partyHead = partyHead;
		HM = hM;
		this.noOfMLA = noOfMLA;
	}



	public Govt(String state, String partyHead, String hM) {
		super();
		this.state = state;
		this.partyHead = partyHead;
		HM = hM;
	}
	
	public void vote() {
		
		
		System.out.println(state);
		System.out.println(partyHead);
		System.out.println(HM);
		System.out.println(noOfMLA);

	}

}
