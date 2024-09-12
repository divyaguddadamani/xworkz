package com.xworkz.rnd.data;

import java.time.LocalDateTime;

public class PastDateTime {

	public static void main(String[] args) {


		LocalDateTime past = LocalDateTime.now().minusDays(100);
        System.out.println( past);

	}

}
