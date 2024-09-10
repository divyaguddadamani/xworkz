package com.xworkz.details.runner;

import com.xworkz.details.State;

public class StateRunner {

	public static void main(String[] args) {
		State state1=new State("karnataka", 70, 191791, "siddaramaiah", "beagaluru", 31);
				
		State state2=new State("up", 230, 243286, "yogi adityanath", "lucknow", 75);
		
		boolean same=state1.equals(state2);
		System.out.println(same);
	}

}
