package com.xworkz.inherit.runner;

import com.xworkz.inherit.data.Cat;
import com.xworkz.inherit.data.Puppy;

public class AnimalRunner {

	public static void main(String[] args) {
		
		Cat cat =new Cat();
		cat.animals();
		cat.eat();
		
		
		
		Puppy puppy=new Puppy();
		puppy.animals();
		puppy.run();
		puppy.babyDog();
		

				

	}

}
