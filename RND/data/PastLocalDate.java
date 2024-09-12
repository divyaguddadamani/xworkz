package com.xworkz.rnd.data;

import java.time.LocalDate;

public class PastLocalDate {

	public static void main(String[] args) {
	
		LocalDate past = LocalDate.now().minusMonths(2);
        System.out.println(past);

	}

}
