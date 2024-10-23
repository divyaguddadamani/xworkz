package com.java.hr.dto;

import java.awt.List;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class HRrunner {

	public static void main(String[] args) {

		Collection<HRDto> collection = new LinkedList<>();

		HRDto dto1 = new HRDto("Divya", "BE", 3, "Bangalore");
		HRDto dto2 = new HRDto("Darshan", "MBA", 4, "Mangalore");
		HRDto dto3 = new HRDto("Deepak", "BBA", 5, "Belagavi");
		HRDto dto4 = new HRDto("Shrikant", "Bcom", 6, "Mysore");
		HRDto dto5 = new HRDto("Kalpana", "BSC", 7, "Mumbai");
		HRDto dto6 = new HRDto("varun", "Btech", 8, "Hydrabad");
		HRDto dto7 = new HRDto("madhu", "MBBS", 9, "goa");
		HRDto dto8 = new HRDto("kavya", "BA", 10, "Bijapur");
		HRDto dto9 = new HRDto("vikas", "MCA", 11, "Bagalkot");
		HRDto dto10 = new HRDto("priya", "BCA", 12, "Huballi");

		collection.add(dto10);
		collection.add(dto9);
		collection.add(dto8);
		collection.add(dto7);
		collection.add(dto6);
		collection.add(dto5);
		collection.add(dto4);
		collection.add(dto3);
		collection.add(dto2);
		collection.add(dto1);

		collection.stream().filter(ref -> ref.getLocation().startsWith("B")).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref.getName()));

		System.out.println("============================");

		collection.stream().filter(ref -> ref.getTotalExp() > 5).forEach(ref -> System.out.println(ref));

		System.out.println("============================");

		collection.stream().filter(ref -> ref.getName().endsWith("a")).forEach(ref -> System.out.println(ref));

		System.out.println("============================");

		collection.stream().map(ref -> ref.getLocation()).forEach(ref -> System.out.println(ref));

		System.out.println("============================");

		collection.stream().map(ref -> ref.getName()).forEach(ref -> System.out.println(ref));

		System.out.println("============================");

		collection.stream().sorted(Comparator.comparing(HRDto::getName).thenComparing(HRDto::getQualification))
				.forEach(ref -> System.out.println(ref));

		System.out.println("============================");

		collection.stream().sorted((ref1, ref2) -> Double.compare(ref2.getTotalExp(), ref1.getTotalExp()))
				.forEach(ref -> System.out.println(ref));

		System.out.println("============================");

		Iterator<HRDto> iterator = collection.iterator();

		while (iterator.hasNext()) {
			HRDto ref = iterator.next();

			if (ref.getName().startsWith("v")) {
				iterator.remove();
				
			}
		}
		System.out.println("Remaining dto's");
        for (HRDto ref : collection) {
            System.out.println(ref);
        }
		System.out.println("============================");

		
		LinkedList<HRDto> ref = (LinkedList<HRDto>) collection;

		ListIterator<HRDto> listIterator = ref.listIterator(8);

		System.out.println("listTterator");

		while (listIterator.hasPrevious()) {
			HRDto ref1 = listIterator.previous();
			System.out.println(ref);
		}
	}

}
