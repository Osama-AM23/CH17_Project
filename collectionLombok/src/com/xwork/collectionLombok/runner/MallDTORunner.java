package com.xwork.collectionLombok.runner;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import com.xworkz.collectionLombok.constants.Address;
import com.xworkz.collectionLombok.dto.MallDTO;

public class MallDTORunner {

	public static void main(String[] args) {

		MallDTO mall1 = new MallDTO(1, "LuluMall", Address.GOPALAPURA_BINNIPETE, " Mr. Yusuf Ali", 451000);
		MallDTO mall2 = new MallDTO(2, "Mantri Square Mall", Address.MALLESHWARAM, "Mr. Sushil Mantri", 930000);
		MallDTO mall3 = new MallDTO(3, "UB City Mall", Address.ASHOK_NAGAR, "Vijay Mallya", 530000);
		MallDTO mall4 = new MallDTO(4, "Orion Mall", Address.RAJAJINAGAR, "Githa Shankar", 82000);
		MallDTO mall5 = new MallDTO(5, "VR Bengaluru", Address.WHITEFIELD, "Xander Group", 600000);
		MallDTO mall6 = new MallDTO(6, "Forum Mall", Address.KORAMANGALA, "Muhammed Ali", 780000);
		MallDTO mall7 = new MallDTO(7, "Garuda Mall", Address.ASHOK_NAGAR, "Mr.Uday Garuda", 80000);
		MallDTO mall8 = new MallDTO(8, "Bangalore Central Mall", Address.BELLANDUR, "Future Group", 92000);
		MallDTO mall9 = new MallDTO(9, "Inorbit Mall", Address.WHITEFIELD, "K Raheja Corporation", 370030);
		MallDTO mall10 = new MallDTO(10, "MG Mall", Address.MG_ROAD, "Vijay Rajesh", 420100);

		Collection<MallDTO> collection1 = new LinkedList<MallDTO>();

		collection1.add(mall1);
		collection1.add(mall2);
		collection1.add(mall3);
		collection1.add(mall4);
		collection1.add(mall5);
		collection1.add(mall6);
		collection1.add(mall7);
		collection1.add(mall8);
		collection1.add(mall9);
		collection1.add(mall10);

		collection1.forEach(show -> System.out.println(show));
		System.out.println("-------------------Decrease order in id---------------------");

		collection1.stream().sorted((mallA, mallB) -> Integer.compare(mallB.getId(), mallA.getId()))
				.forEach(ref -> System.out.println(ref));
		System.out.println("---------------------Decrease order in name-------------------");

		collection1.stream().sorted((nameA, nameB) -> nameB.getName().compareTo(nameA.getName()))
				.forEach(ref -> System.out.println(ref));
		System.out.println("---------------Iterator-------------------------");
		
		Iterator<MallDTO> iterator = collection1.iterator();
		while (iterator.hasNext()) {
			MallDTO dto =iterator.next();
			System.out.println(dto);
		} 
		System.out.println("----------------------------------------");

		LinkedList<MallDTO> collection = (LinkedList<MallDTO>)collection1;

		ListIterator<MallDTO> listIterator = collection.listIterator();

		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("-----------------");
		while (listIterator.hasPrevious()) {

			System.out.println(listIterator.previous());
		}
		System.out.println("----------------------------------------");

		collection1.stream().filter(land -> land.getLandDimension() < 100000).forEach(show -> System.out.println(show));
		System.out.println("----------------------------------------");

		collection1.stream().map(name -> name.getName()).forEach(ref -> System.out.println(ref));
		System.out.println("----------------------------------------");

		collection1.stream()
				.sorted((land1, land2) -> Double.compare(land1.getLandDimension(), land2.getLandDimension()))
				.forEach(ref -> System.out.println(ref));

	}
}
