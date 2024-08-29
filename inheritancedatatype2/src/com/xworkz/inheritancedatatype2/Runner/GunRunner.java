package com.xworkz.inheritancedatatype2.Runner;

import com.xworkz.inheritancedatatype2.Dboss;
import com.xworkz.inheritancedatatype2.Godse;
import com.xworkz.inheritancedatatype2.Gun;
import com.xworkz.inheritancedatatype2.Police;
import com.xworkz.inheritancedatatype2.Soldier;

public class GunRunner {

	public static void main(String[] args) {
		
		Soldier soldier= new Soldier();
		soldier.use();
		System.out.println("----------");
		
		Police police=new Police();
		Gun gun=new Gun("Amw", "Russia", "Sinpper");
		police.hold(gun);
		System.out.println("----------");
		
		Dboss dboss=new Dboss(gun);
		dboss.hide();
		System.out.println("----------");
		
		Godse godse= new Godse();
		godse.work();
		
	}
	

}
