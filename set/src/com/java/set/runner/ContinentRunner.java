package com.java.set.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.java.set.dto.CountinentDto;
import com.java.set.dto.CountryDto;
import com.java.set.dto.PresidentDto;

public class ContinentRunner {

	public static void main(String[] args) {


        PresidentDto president1 = new PresidentDto("divya", "Prime Minister", 54, null);
        PresidentDto president2 = new PresidentDto("deepak", "President", 60, null);

        
        CountryDto country1 = new CountryDto("india", 123, president1);
        CountryDto country2 = new CountryDto("India", 456, president2);

       
        List<CountryDto> countries1 = new ArrayList<>();
        countries1.add(country1);

        List<CountryDto> countries2 = new ArrayList<>();
        countries2.add(country2);

        
        CountinentDto continent1 = new CountinentDto("usa", 789, countries1);
        CountinentDto continent2 = new CountinentDto("korea", 890, countries2);

        Map<String, CountinentDto> continentMap = new HashMap<>();
        continentMap.put("Continent1", continent1);
        continentMap.put("Continent2", continent2);

     
        Set<String> keys = continentMap.keySet();
        keys.forEach(System.out::println);

        Collection<CountinentDto> values = continentMap.values();
        values.forEach(System.out::println);

        Set<Map.Entry<String, CountinentDto>> entries = continentMap.entrySet();
        entries.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    
}
}
