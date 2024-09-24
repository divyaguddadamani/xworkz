package com.xworkz.internal;

public interface Projector {
	
	String start();
	
	default int size() {
		return 30;
		
	}
	
	

}
