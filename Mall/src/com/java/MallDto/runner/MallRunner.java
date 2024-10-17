package com.java.MallDto.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

import com.java.MallDto.Location;
import com.java.MallDto.MallDto;


public class MallRunner {

	public static void main(String[] args) {
		
		Collection<MallDto> collection =new ArrayList<MallDto>();
		
		MallDto mall1=new MallDto(11, "PHOENIX_MARKETCITY", Location.WHITEFIELD, "divya",95000.5 );
		MallDto mall2=new MallDto(852, "ORION_MALL", Location.RAJAJINAGAR, "depak",65000.5 );
		MallDto mall3=new MallDto(523, "FORUM_MALL", Location.KORAMANGALA, "darshan",150000.5 );
		MallDto mall4=new MallDto(74, "UB_CITY_MALL", Location.VITTAL_MALLYA_ROAD, "kalpana",25000.5 );
		MallDto mall5=new MallDto(501, "MANTRI_SQUARE_MALL", Location.MALLESWARAM, "shrikant",35600.5 );
		MallDto mall6=new MallDto(65, "VR_BENGALURU", Location.MAGRATH_ROAD, "arun",86000.5 );
		MallDto mall7=new MallDto(37, "ESTEEM_MALL", Location.MAGRATH_ROAD, "kiran",95200.5 );
		MallDto mall8=new MallDto(28, "GARUDA_MALL", Location.HEBBAL, "vidya",152000.5 );
		MallDto mall9=new MallDto(99, "BANGALORE_CENTRAL_MALL", Location.BELLANDUR, "vinayak",359100.5 );
		MallDto mall10=new MallDto(120, "GOPALAN_MALL", Location.BANNERGHATTA_ROAD, "revati",369520.5 );
		
		collection.add(mall10);
		collection.add(mall9);
		collection.add(mall8);
		collection.add(mall7);
		collection.add(mall6);
		collection.add(mall5);
		collection.add(mall4);
		collection.add(mall3);
		collection.add(mall2);
		collection.add(mall1);
		
		System.out.println("size is:"+collection.size());
		
		collection.stream().sorted((ref1,ref2)->Double.compare(ref2.getId(), ref1.getId())).forEach(ref->System.out.println(ref));
		
		System.out.println("=================================================");
		
		collection.stream().sorted((ref1,ref2)->ref2.getName().compareTo(ref1.getName())).forEach(ref->System.out.println(ref));
		
		System.out.println("=================================================");
		
		collection.stream().filter(ref->ref.getLandDimension()<100000).forEach(ref->System.out.println(ref));
		
		System.out.println("=================================================");
		
		collection.stream().map(ref->ref.getName()).forEach(ref->System.out.println(ref));
		
		System.out.println("=================================================");
		
		collection.stream().sorted((ref1,ref2)->Double.compare(ref1.getLandDimension(), ref2.getLandDimension())).map(ref->ref.getLandDimension()).
				forEach(ref->System.out.println(ref));
		
		System.out.println("=================================================");
		
		Iterator<MallDto> iterator = collection.iterator();
	    while (iterator.hasNext()) {
	    System.out.println(iterator.next());
	    }
	    
	    System.out.println("=================================================");
	    
	    
	    ListIterator<MallDto> listIterator = ((ArrayList<MallDto>) collection).listIterator();
	    while (listIterator.hasNext()) {
	        System.out.println(listIterator.next());
	    }
	}

}
