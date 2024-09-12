package com.xworkz.rnd.data;

public class Person {
	
	private String name;
	private String email;
	private int age;
	private long mobileNo;
	
	
    public Person(String name, String email, int age, long mobileNo) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.mobileNo = mobileNo;
    }

  
    public void show() {
        System.out.println( name);
        System.out.println(email);
        System.out.println(age);
        System.out.println(mobileNo);
       
    }

}
