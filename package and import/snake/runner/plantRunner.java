package com.xworkz.snake.runner;
import com.xworkz.snake.Plant;
public class plantRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plant plant1=new Plant("coconut",20,32,"traingle","green");
		Plant plant2=new Plant("mango",35,26,"oval","lightgreen");
		Plant plant3=new Plant("banana",19,12,"ovalrectangle","darkgreen");
		
		plant1.Plants("taproot",12.0,15,"oval","orange");
		plant2.Plants("joinroot",15.0,17,"traigle","lightgreen");
		plant3.Plants("mother",25,23,"round","yellow");
		
		Plant[] val =new Plant[3];
		val[0]=plant1;
		val[1]=plant2;
		val[2]=plant3;
		
		for (Plant plantdetails:val)
		{
			plantdetails.print();
		}
	}

}
