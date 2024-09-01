package com.xworkz.toothpast.Runner;
import com.xworkz.toothpast.data.Metro;
import com.xworkz.toothpast.data.SuburbanTrain;
import com.xworkz.toothpast.data.Train;

public class TrainRunner {

	public static void main(String[] args) {
		Metro metro=new Metro(5,"rajajinagar","vijaynagar");
		metro.run();
		
		Train metro2=new Train(2,"mejastic","rrnagr");
		metro2.run();

		
		System.out.println("=============================");
		
		
		SuburbanTrain train=new SuburbanTrain("mgroad","navaranga");
		train.run();
		
		Train train1=new Train("kengari","mejastic");
		train1.run();
		
	}

}
