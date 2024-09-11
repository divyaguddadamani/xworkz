package com.xworkz.example.datarunner;

import com.xworkz.example.data.Bag;

public class BagRunner {

	public static void main(String[] args) {
		
		Bag bag=new Bag("cotton", 350);
		bag.carry();
		bag.store();
		
	}

}
