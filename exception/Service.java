package com.xworkz.exception;

public class Service {
	
	public  void run(String validPasswordException)throws ValidPasswordException
	{
			
	if(validPasswordException==null || validPasswordException.equals(""))
	{
		System.out.println("invalid password will continue exception");
		throw new ValidPasswordException();
	}
	else {
		System.out.println("valid password will continue exception");
	}
	
		
	}}
