package com.xworkz.snake.details;

import com.xworkz.snake.Sandal;
import com.xworkz.snake.runner.SandalStore;

public class SandalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SandalStore data=new SandalStore();
		data.print();
		
		Sandal sandal1=new Sandal("Flip-Flops", 'm', 200, "black");
		Sandal sandal2=new Sandal("Slides", 's', 250, "blue");
		Sandal sandal3=new Sandal("heels", 'x', 300, "white");
		Sandal sandal4=new Sandal("shoes", 'l', 220, "pink");
		Sandal sandal5=new Sandal("crocks", 'l', 320, "black");
		
		data.save(sandal1);
		data.save(sandal2);
		data.save(sandal3);
		data.save(sandal4);
		data.save(sandal5);
		
		data.print();

	}

}
