package com.xworkz.stream.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class PrimeMinister {

	public static void main(String[] args) {
		
		   Collection<String> primeMinisters=new ArrayList<String>(); 
		
		
			primeMinisters.add("Narendra Modi");
	        primeMinisters.add("Manmohan Singh");
	        primeMinisters.add("Atal Bihari Vajpayee");
	        primeMinisters.add("P. V. Narasimha Rao");
	        primeMinisters.add("Rajiv Gandhi");
	        primeMinisters.add("Indira Gandhi");
	        primeMinisters.add("Morarji Desai");
	        primeMinisters.add("Lal Bahadur Shastri");
	        primeMinisters.add("Jawaharlal Nehru");
	        primeMinisters.add("Vishwanath Pratap Singh");
	        primeMinisters.add("Chandra Shekhar");
	        primeMinisters.add("H. D. Deve Gowda");
	        primeMinisters.add("I. K. Gujral");
	        primeMinisters.add("Gulzarilal Nanda");
	        primeMinisters.add("Charan Singh");

	        
			
			//Ascending
	        primeMinisters.stream().sorted().collect(Collectors.toList())
							.forEach(ref -> System.out.println("primeMinisters name :" + ref));

		  // descending
	        primeMinisters.stream().sorted((refrence, ref) -> ref.compareTo(refrence)).collect(Collectors.toList())
							.forEach(ref -> System.out.println("primeMinisters name  :" + ref));
			
	}

}
