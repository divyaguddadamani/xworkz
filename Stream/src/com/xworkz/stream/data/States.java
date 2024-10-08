package com.xworkz.stream.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class States {

	public static void main(String[] args) {
		
		Collection<String> states=new ArrayList<String>();
		
		states.add("Andhra Pradesh");
        states.add("Arunachal Pradesh");
        states.add("Assam");
        states.add("Bihar");
        states.add("Chhattisgarh");
        states.add("Goa");
        states.add("Gujarat");
        states.add("Haryana");
        states.add("Himachal Pradesh");
        states.add("Jharkhand");
        states.add("Karnataka");
        states.add("Kerala");
        states.add("Madhya Pradesh");
        states.add("Maharashtra");
        states.add("Manipur");
        states.add("Meghalaya");
        states.add("Mizoram");
        states.add("Nagaland");
        states.add("Odisha");
        states.add("Punjab");
        states.add("Rajasthan");
        states.add("Sikkim");
        states.add("Tamil Nadu");
        states.add("Telangana");
        states.add("Tripura");
        states.add("Uttar Pradesh");
        states.add("Uttarakhand");
        states.add("West Bengal");
        

		//Ascending
        states.stream().sorted().collect(Collectors.toList())
						.forEach(ref -> System.out.println("primeMinisters name :" + ref));

	  // descending
        states.stream().sorted((refrence, ref) -> ref.compareTo(refrence)).collect(Collectors.toList())
						.forEach(ref -> System.out.println("primeMinisters name  :" + ref));

	}

}
