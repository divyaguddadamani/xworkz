package com.xworkz.rnd.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		        
		        String filePath = "C:\\Users\\Admin\\eclipse-workspace\\RND\\src\\com\\xworkz\\rnd\\data\\Dance.txt";

		     
		        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
		            String line;
		            while ((line = br.readLine()) != null) {
		                
		                System.out.println(line);
		            }
		        } catch (IOException e) {
		        	  System.out.println("io exception");
		        }
		    }

	

}
