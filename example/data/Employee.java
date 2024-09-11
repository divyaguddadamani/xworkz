package com.xworkz.example.data;

public class Employee {

	private String name;
	private int age;
	private double sal;
	
	public Employee(String name, int age, double sal) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	
	public void work()
	{
		System.out.println("run work in Employee");
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(sal);
		
	}
	
	
}
