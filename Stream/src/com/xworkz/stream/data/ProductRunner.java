package com.xworkz.stream.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

import com.xworkz.stream.dataDto.ProductDto;

public class ProductRunner {

	public static void main(String[] args) {

		Collection<ProductDto> info =new ArrayList<ProductDto>();
		ProductDto dto1 =new ProductDto(1, "comb", 20, "shrikant");
		ProductDto dto2=new ProductDto(2, "rice", 50, "divya");
		ProductDto dto3 =new ProductDto(3, "paste", 10, "deepak");
		ProductDto dto4 =new ProductDto(4, "book", 30, "darshan");
		ProductDto dto5 =new ProductDto(5, "juice", 40, "kalpana");
		ProductDto dto6 =new ProductDto(6, "bottle", 25, "geeta");
		ProductDto dto7 =new ProductDto(7, "sliper", 200, "megha");
		ProductDto dto8 =new ProductDto(8, "bag", 300, "gunashree");
		ProductDto dto9 =new ProductDto(9, "dress", 1000, "revati");
		ProductDto dto10 =new ProductDto(10, "mobile", 20000, "sneha");
		ProductDto dto11 =new ProductDto(11, "bangles", 200, "laxmi");
		
		info.add(dto1);
		info.add(dto2);
		info.add(dto3);
		info.add(dto4);
		info.add(dto5);
		info.add(dto6);
		info.add(dto7);
		info.add(dto8);
		info.add(dto9);
		info.add(dto10);
		info.add(dto11);

	info.forEach((ProductDto)->System.out.println(ProductDto));
		
		System.out.println("==================");
		
		info
		.stream()
		.sorted()
		.forEach((ref)->System.out.println(ref));
		
		System.out.println("==================");
		
		info.stream()
		.filter(product -> product.getCost() > 5000).collect(Collectors.toList())
		.forEach((ref)->System.out.println(ref));

		System.out.println("==================");
		
		info.stream()
		.filter(product->product.getCost()>5000&& product.getCost()<30000)
		.collect(Collectors.toList())
		.forEach((ref)->System.out.println(ref));
		
		
		System.out.println("==================");
		
		info.stream()
		.sorted((ref1,ref2)->ref2.compareTo(ref1)).collect(Collectors.toList())
		.forEach((ref)->System.out.println(ref));
		
		System.out.println("==================");
		
		info.stream()
        .filter(product -> product.getVendor().startsWith("s"))
        .sorted()
        .collect(Collectors.toList())
        .forEach((ref)->System.out.println(ref));
		
		System.out.println("==================");
		

		/*info.stream()
		.filter(product->product.getCost()&&product.getId())
		.sorted()
		.collect(Collectors.toList())
        .forEach((ref)->System.out.println(ref));
        */
		 
		
		System.out.println("==================");
		
		info.stream()
		.map(product -> product.getName())
		.collect(Collectors.toList())
        .forEach((ref)->System.out.println(ref));
		
		System.out.println("==================");
		
		info.stream()
		.map(product -> product.getId())
		.collect(Collectors.toList())
        .forEach((ref)->System.out.println(ref));
		
		System.out.println("==================");
		
		info.stream()
        .map(product -> product.getName().toUpperCase())
        .collect(Collectors.toList())
        .forEach((ref)->System.out.println(ref));;
		
	}

}
