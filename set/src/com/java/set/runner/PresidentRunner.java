package com.java.set.runner;

import java.util.HashMap;
import com.java.set.dto.AddressDto;
import com.java.set.dto.PresidentDto;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class PresidentRunner {

	public static void main(String[] args) {
	
	
		AddressDto address1 = new AddressDto(10, "rajajinagar", "Springfield", "india", null);
        AddressDto address2 = new AddressDto(11, "rrnagar", "Capital City", "korea", null);

       
        PresidentDto president1 = new PresidentDto("veena", " Leader", 65, address1);
        PresidentDto president2 = new PresidentDto("megha", "Head of State", 55, address2);

        
        Map<String, PresidentDto> presidentMap = new HashMap<>();
        presidentMap.put("President1", president1);
        presidentMap.put("President2", president2);

        System.out.println("==========================");

        Set<String> keys = presidentMap.keySet();
        keys.forEach(System.out::println);
        System.out.println("==========================");

       
        Collection<PresidentDto> values = presidentMap.values();
        values.forEach(System.out::println);

        System.out.println("==========================");


        Set<Map.Entry<String, PresidentDto>> entries = presidentMap.entrySet();
        entries.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    
		
	}

}
