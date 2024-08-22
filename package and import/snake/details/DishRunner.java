package com.xworkz.snake.details;

import com.xworkz.snake.SideDish;
import com.xworkz.snake.runner.Dishes;

public class DishRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dishes value=new Dishes();
		value.shows();
		
		SideDish side1=new SideDish("kabab", 150, "non-veg");
		SideDish side2=new SideDish("paneer tikka", 220, "veg");
		SideDish side3=new SideDish("chicken 65", 320, "non-veg");
		SideDish side4=new SideDish("tandoori chicken", 350, "non-veg");
		SideDish side5=new SideDish("gobi", 100, "veg");
		
		value.store(side1);
		value.store(side2);
		value.store(side3);
		value.store(side4);
		value.store(side5);
		
		value.shows();
		
	}

}
