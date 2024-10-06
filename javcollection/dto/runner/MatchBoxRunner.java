package com.java.javcollection.dto.runner;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.java.javcollection.dto.CountryDto;
import com.java.javcollection.dto.MatchBox;
import com.java.javcollection.dto.constants.Code;
import com.java.javcollection.dto.constants.Continent;

public class MatchBoxRunner {

	public static void main(String[] args) {
		
		Collection<MatchBox> collection=new LinkedList<MatchBox>();
		
		MatchBox<Integer,String> matchbox1=new MatchBox<Integer,String>(11,"pushpa");
		MatchBox<Integer,String> matchbox2=new MatchBox<Integer,String>(12,"asia"); 
		MatchBox<Integer,String> matchbox3=new MatchBox<Integer,String>(13,"Safety "); 
		MatchBox<Integer,String> matchbox4=new MatchBox<Integer,String>(14,"Goodness"); 
		MatchBox<Integer,String> matchbox5=new MatchBox<Integer,String>(15,"Saijee"); 

		collection.add(matchbox1);
		collection.add(matchbox2);
		collection.add(matchbox3);
		collection.add(matchbox4);
		collection.add(matchbox5);

		System.out.println("size is:"+collection.size());
		System.out.println("is empty:"+collection.isEmpty());
		collection.remove(matchbox5);
		System.out.println("size is:"+collection.size());
		
		Iterator<MatchBox> iterator=collection.iterator();
		while(iterator.hasNext())
		{
			MatchBox store=iterator.next();
			System.out.println(store);
			
			
		}
		
		System.out.println("========================================");
		
		
		
		
	}

}
