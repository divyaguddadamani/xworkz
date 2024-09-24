package com.xworkz.external;

import java.awt.print.Book;

import com.xworkz.internal.HpProjector;
import com.xworkz.internal.LocalMarket;
import com.xworkz.internal.Market;
import com.xworkz.internal.Person;
import com.xworkz.internal.StoryBook;

public class Runner {

	public static void main(String[] args) {
		
		HpProjector hp=new HpProjector();
		hp.size();
		hp.start();
		
		System.out.println("==========================================");
		
		Market market=new LocalMarket();
		market.bill();
		market.location();
		
		System.out.println("==========================================");
		
		StoryBook book=new StoryBook();
		book.cost();
		book.name();
		
		System.out.println("==========================================");
		
		Person person=new Person("laxmi");
		System.out.println("name:"+person.getname());
		person.setname("divya");
		System.out.println("name:"+person.getname());
		
	
		
	}

}
