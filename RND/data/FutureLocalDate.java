package com.xworkz.rnd.data;

import java.time.LocalDate;

public class FutureLocalDate {

	public static void main(String[] args) {
		
		LocalDate future = LocalDate.now().plusWeeks(10);
        System.out.println(future);

	}

}
