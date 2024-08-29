package com.xworkz.app.runner;

import com.xworkz.app.data.Dboos;
import com.xworkz.app.data.Godse;
import com.xworkz.app.data.Gun;
import com.xworkz.app.data.Police;
import com.xworkz.app.data.Soldier;

public class GunRunner {

	public static void main(String[] args) {
		
		Soldier soldier=new Soldier();
		soldier.work();
		
		
		System.out.println("=============================");
		
		Police police=new Police();
		Gun gun=new Gun("RPK","russia","light-machine-gun");
		police.Ak47(gun);
		
		System.out.println("=============================");
		
		Gun gun2=new Gun("Colt M1911","USA","Semi-automatic-pistol");
		Dboos dboos=new Dboos(gun2);
		dboos.shoot();
		
		System.out.println("=============================");
		
		Godse godse=new Godse();
		godse.fires();
		
		
	}

}
