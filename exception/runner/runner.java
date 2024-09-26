package com.xworkz.exception.runner;

import com.xworkz.exception.InvalidEmailException;
import com.xworkz.exception.Service;
import com.xworkz.exception.Servicecheck;
import com.xworkz.exception.ValidPasswordException;

public class runner {

	public static void main(String[] args) throws ValidPasswordException, InvalidEmailException {
		Service service=new Service();
		service.run("divya123");
			
	
	Servicecheck servicecheck=new Servicecheck();
	servicecheck.save("divya@gmail.com");
	servicecheck.AcceptPrice(20);
	


}
}