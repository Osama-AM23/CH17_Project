package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.dto.MatchBoxDTO;

public class MatchBoxRunner {

	public static void main(String[] args) {

		MatchBoxDTO matchBox1 = new MatchBoxDTO(1.5, "Cat match Box");
		MatchBoxDTO matchBox2 = new MatchBoxDTO(2.5, "Pegion match Box");
		MatchBoxDTO matchBox3 = new MatchBoxDTO(1.0, "Tiger match Box");
		MatchBoxDTO matchBox4 = new MatchBoxDTO(1.0, "Abc match Box");
		MatchBoxDTO matchBox5 = new MatchBoxDTO(2.0, "Double Cat match Box");

		Collection<MatchBoxDTO> collection = new ArrayList<MatchBoxDTO>();

		collection.add(matchBox1);
		collection.add(matchBox2);
		collection.add(matchBox3);
		collection.add(matchBox4);
		collection.add(matchBox5);

		System.out.println(collection.size());

		System.out.println(collection.isEmpty());

		Iterator<MatchBoxDTO> ref= collection.iterator();
		
		while(ref.hasNext()) {
			MatchBoxDTO refrence=ref.next();
			if(refrence.getCost()<=1.0) {
			System.out.println(refrence);
			}
		}

	}

}
