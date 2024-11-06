package com.java.set.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.java.set.dto.AddressDto;
import com.java.set.dto.CountryDto;
import com.java.set.dto.PresidentDto;

public class CountryRunner {

	 public static void main(String[] args) {
	        
	        AddressDto presidentAddress = new AddressDto(1, "Capitol Hill", "Capital City", "Capital State", null);

	        
	        PresidentDto president1 = new PresidentDto("darshan", "Prime Minister", 58, presidentAddress);
	        PresidentDto president2 = new PresidentDto("vidya", "President", 60, presidentAddress);

	        CountryDto country1 = new CountryDto("india", 101, president1);
	        CountryDto country2 = new CountryDto("china", 102, president2);

	     
	        Map<String, CountryDto> countryMap = new HashMap<>();
	        countryMap.put("Country1", country1);
	        countryMap.put("Country2", country2);

	       
	      
	        Set<String> keys = countryMap.keySet();
	        keys.forEach(System.out::println);

	      
	        Collection<CountryDto> values = countryMap.values();
	        values.forEach(System.out::println);

	       
	        Set<Map.Entry<String, CountryDto>> entries = countryMap.entrySet();
	        entries.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
	  
}
}
