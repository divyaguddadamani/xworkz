package com.xworkz.rnd.data;

import java.time.LocalDateTime;

public class FutureDateTime {

	public static void main(String[] args) {


		 LocalDateTime future = LocalDateTime.now().plusDays(100);
	        System.out.println( future);
	}

}
