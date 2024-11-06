package com.java.set.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRunner {

	public static void main(String[] args) {


		
		Map<Long,String> map=new HashMap<>();
		map.put(8867640457l, "guna@gmail.com");
		map.put(8123791097l, "divya@gmail.com");
		map.put(8867640645l, "deepak@gmail.com");
		map.put(8345896175l, "darshan@gmail.com");
		map.put(8516789452l, "kalpana@gmail.com");
		map.put(8894563172l, "shrikant@gmail.com");
		
		Set<Long> keys=map.keySet();
		keys.forEach((ref)->System.out.println(ref));
		System.out.println("=====================================");
		Collection<String> values=map.values();
		values.forEach((ref)->System.out.println(ref));
		System.out.println("=====================================");
		Set<Map.Entry<Long, String>> entries=map.entrySet();
		entries.forEach((ref)->System.out.println(ref));
		
		
		

	}

}
