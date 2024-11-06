package com.java.set.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.java.set.dto.AddressDto;
import com.java.set.dto.CountryDto;

public class AddressDtoRunner {

	public static void main(String[] args) {
		
		   CountryDto country = new CountryDto("India", 91, null);

	        AddressDto address1 = new AddressDto(101, "MG Road", "Bangalore", "Karnataka", country);
	        AddressDto address2 = new AddressDto(102, "Brigade Road", "Bangalore", "Karnataka", country);

	        Map<String, AddressDto> addressMap = new HashMap<>();
	        addressMap.put("divya", address1);
	        addressMap.put("deepak", address2);

	        System.out.println("==========================");

	       
	        Set<String> keys = addressMap.keySet();
	        keys.forEach(System.out::println);

	      
	        System.out.println("==========================");
	        Collection<AddressDto> values = addressMap.values();
	        values.forEach(System.out::println);

	       
	        System.out.println("\nEntries:");
	        Set<Map.Entry<String, AddressDto>> entries = addressMap.entrySet();
	        entries.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
	}

}
