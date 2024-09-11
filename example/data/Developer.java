package com.xworkz.example.data;

public class Developer extends Employee{
	
	

public Developer(String name, int age, double sal) {
		super(name, age, sal);
		
	}

public void writeCode(String Dname)
{
	System.out.println("run write code in dveloper");
	System.out.println(Dname);
}

@Override
public void work()
{
	System.out.println("run work in Employee");
}

//overloading
public void writeCode(int DAge)
{
	System.out.println("overloading method......");
	System.out.println(DAge);
	this.writeCode("laxmi");
}
}
