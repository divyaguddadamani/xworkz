package com.xworkz.implement;

import com.xworkz.media.PgRule;

public class PriyaPg implements PgRule{

	@Override
	public boolean wifi() {
	System.out.println("run wifi in Priya");
		return false;
	}

}
