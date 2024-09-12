package com.xworkz.rnd.data;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Info {
	
	    public static void main(String[] args) {
	     
	        String filePath = "C:\\Users\\Admin\\eclipse-workspace\\RND\\src\\com\\xworkz\\rnd\\data\\info.txt";

	      
	        String name = " Divya";
	        String email = "divya@gmail.com";
	        long mobile = 8123791097l;

	        
	        try (BufferedWriter ref = new BufferedWriter(new FileWriter(filePath))) {
	        	
	            ref.write("Name: " + name);
	            ref.newLine();
	            ref.write("Email: " + email);
	            ref.newLine();
	            ref.write("Mobile: " + mobile);
	            ref.newLine();
	            System.out.println("Data written to file successfully.");
	            
	        } catch (IOException e) {
	        	
	        	 System.out.println("io exception");
	        }
	    }
	

}
