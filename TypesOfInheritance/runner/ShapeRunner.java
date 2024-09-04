package com.xworkz.inherit.runner;

import com.xworkz.inherit.data.Circle;
import com.xworkz.inherit.data.Square;

public class ShapeRunner {

	public static void main(String[] args) {
		
		Square  square=new Square();
		square.drawSquare();
		square.draw();
		
		Circle circle= new Circle();
		circle.drawCircle();
		circle.draw();

	}

}
