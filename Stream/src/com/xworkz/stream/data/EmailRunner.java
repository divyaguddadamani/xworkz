package com.xworkz.stream.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.stream.dataDto.EmailDto;
import com.xworkz.stream.dataDto.ProductDto;

public class EmailRunner {

	public static void main(String[] args) {
		
		Collection<EmailDto> info =new ArrayList<EmailDto>();
		 EmailDto dto1=new EmailDto("divya@gmail.com","darshu@gmail.com","resume","i am divya");
		 EmailDto dto2=new EmailDto("deepak@gmail.com","kalpana@gmail.com","job","xyz");
		 EmailDto dto3=new EmailDto("vikas@gmail.com","shrikant@gmail.com","leave","abc");
		 EmailDto dto4=new EmailDto("arun@gmail.com","varun@gmail.com","transfer","pqr");
		 EmailDto dto5=new EmailDto("vidya@gmail.com","vinayak@gmail.com","job","lmn");

		 info.add(dto5);
		 info.add(dto4);
		 info.add(dto3);
		 info.add(dto2);
		 info.add(dto1);
		 
		 
		int ref= info.size();
		System.out.println("Size:" +ref);
		
		boolean ref1=info.isEmpty();
		System.out.println("empty:" +ref1);
		
		boolean ref2=info.contains(dto5);
		System.out.println("contain:" +ref2);
		
		boolean ref3=info. remove(dto5);
		System.out.println(ref3);
		
		boolean ref4=info.containsAll(info);
		System.out.println(ref4);
		
		boolean ref5=info.addAll(info);
		System.out.println(ref5);
		
		boolean ref6=info.retainAll(info);
		System.out.println(ref6);
		
        info.forEach((ref7)->System.out.println(ref7)); 
		
		boolean ref8=info.addAll(info);
		System.out.println(ref8);
		
		boolean ref9=info.removeAll(info);
		System.err.println("removeall:"+ref9); 
		
		 info.forEach((ref7)->System.out.println(ref7)); 
		
		 
		 info.add(dto5);
		 info.add(dto4);
		 info.add(dto3);
		 info.add(dto2);
		 info.add(dto1);
		 
		 
		 info.forEach((ref7)->System.out.println(ref7)); 
		 
		 System.out.println("======================");
		 
		 info.clear();
		 
		 System.out.println("======================");
		 
		 
		 info.stream()
			.collect(Collectors.toList())
			.forEach((ref7)->System.out.println(ref7));
			
		
		
	}

}
