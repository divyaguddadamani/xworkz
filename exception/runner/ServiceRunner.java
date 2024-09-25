package com.xworkz.exception.runner;

import com.xworkz.exception.Service;
import com.xworkz.exception.ValidPasswordException;

public class ServiceRunner {

	public static void main(String[] args) throws ValidPasswordException {
		Service service=new Service();
		service.run("divya123");
			}

}
