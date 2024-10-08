package com.xworkz.stream.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PhoneData {

	public static void main(String[] args) {
	
		Collection<Long> collection=new ArrayList<Long>();
		
		collection.add(8123791097l);
		collection.add(8123791091l);
		collection.add(8125791092l);
		collection.add(8125791093l);
		collection.add(8123791097l);
		collection.add(8128791097l);
		collection.add(8193791098l);
		collection.add(9123791090l);
		collection.add(9823791097l);
		collection.add(7523791097l);
		
				
		//Ascending
				collection.stream().sorted().collect(Collectors.toList())
						.forEach(ref -> System.out.println("Phone Number :" + ref));

	  // descending
				collection.stream().sorted((refrence, ref) -> ref.compareTo(refrence)).collect(Collectors.toList())
						.forEach(ref -> System.out.println("Phone Number  :" + ref));
		
	}

}
