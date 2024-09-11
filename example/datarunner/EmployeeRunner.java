package com.xworkz.example.datarunner;

import com.xworkz.example.data.Bag;
import com.xworkz.example.data.Developer;

public class EmployeeRunner {
	public static void main(String[] args) {
		
		Developer ref =new Developer("divya", 22, 30000);
		ref.display();
		
		ref.writeCode(21);
		
		
	}

}
