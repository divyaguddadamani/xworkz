package com.xworkz.snake.runner;

import com.xworkz.snake.River;

public class RiverRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        River river=new River();
        
        river.save("ganga");
        river.save("yamuna");
        river.save("brahmaputra");
        river.save("narmada");
        river.save("krishna");
        river.save("godavari");
        river.save("kaveri");
        
        river.print();
	}

}
