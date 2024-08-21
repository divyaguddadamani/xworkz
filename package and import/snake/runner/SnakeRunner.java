package com.xworkz.snake.runner;
import com.xworkz.snake.Snake;

public class SnakeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Snake snake1=new Snake("akshata",15,"cobra");
      Snake snake2=new Snake("supriya",20,"python");
      Snake snake3=new Snake("vaishnavi",13,"green snake");
		
      
      Snake[] val=new Snake[3];
      val[0]=snake1;
      val[1]=snake2;
      val[2]=snake3;
      
      for(Snake snakedetails:val)
      {
    	  System.out.println(snakedetails);
    	  snakedetails.run();
      }
      
	}

}
