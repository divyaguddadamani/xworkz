package com.xworkz.implement;

import com.xworkz.media.MallRule;

public class LuluMall implements MallRule{

	@Override
	public boolean validId() {
		System.out.println("run validid in Lulumall");
		return false;
	}
	

}
