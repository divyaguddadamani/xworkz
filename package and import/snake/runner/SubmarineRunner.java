package com.xworkz.snake.runner;
import com.xworkz.snake.Submarine;
public class SubmarineRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpublic static void main(String[] args) {
		Submarine submarines1 = new Submarine("drebbel 1", "fleet ballistic missile", 201, 8, 9);
        Submarine submarines2 = new Submarine("Arihant", "guided missile", 150, 9.5, 9.5);
     

        submarines1.Runner(2, 25, 52, 26, 51, "abc", false, 26, "divya", true, "xyz", "nhd", 52, "udj", "klm", "lmn", false , 60, false,
        		"kfn", 0, false, "high", false, "jkl", false, "ghi", false, 0, true, "lmno", true, 26, "kgdi", "gfih");
        submarines2.Runner(2, 25, 52, 26, 51, "abc", false, 26, "divya", true, "xyz", "nhd", 52, "udj", "klm", "lmn", false , 60, false,
        		"kfn", 0, false, "high", false, "jkl", false, "ghi", false, 0, true, "lmno", true, 26, "kgdi", "gfih");
        
   

        Submarine[] submarines = new Submarine[2];
        submarines[0]= submarines1;
        submarines[1]= submarines2;
        for (Submarine submarine : submarines) {
            submarine.print();
        }
    

	}

	}


