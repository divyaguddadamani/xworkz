package com.xworkz.rnd.datarunner;

import com.xworkz.rnd.data.Person;

public class PersonRunner {

	public static void main(String[] args) {
		
		
		    Person person1 = new Person("divya", "divya@gmail.com", 22, 8123791097l);
	        Person person2 = new Person("deepak", "deepak@gmail.com", 30, 8867640457l);
	        Person person3 = new Person("darshan", "darshan@gmail.com", 20,812350249l);
	        Person person4 = new Person("kalpana", "kalana@gmail.com", 50, 2326581652l);
	        Person person5 = new Person("shrikant", "shrikant@gmail.com", 62, 2495378567l);

	        Person[] people = { person1, person2, person3, person4, person5 };

	       
	        for (Person person : people) {
	        	
	        	if(person!=null) 
	        		
	        	{
	            person.show();
	            }
	        	
	        	else
				{
					System.out.println("null pointer exception");
				}
	       
	      }
	        

	}

}
