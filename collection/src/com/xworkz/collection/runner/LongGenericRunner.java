package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class LongGenericRunner {

	public static void main(String[] args) {

		Collection<Long> collection = new ArrayList<Long>();

		collection.add(9952644296L);
		collection.add(8072235606L);
		collection.add(9965624510L);
		collection.add(8584886669L);
		collection.add(7483079907L);
		collection.add(6005370241L);
		collection.add(6363827480L);
		collection.add(9986667354L);
		collection.add(9108402114L);
		collection.add(9591868323L);
		System.out.println("---Before Sorting---");
		collection.forEach(ref -> System.out.println("Mobile No: " + ref));

		// Ascending
		System.out.println("---sorting in Ascending---");
		collection.stream().sorted().collect(Collectors.toList())
				.forEach(refrence -> System.out.println("Mobile No :" + refrence));

		// descending
		System.out.println("---sorting in Descending---");
		collection.stream().sorted((refrence, ref) -> ref.compareTo(refrence)).collect(Collectors.toList())
				.forEach(data -> System.out.println("Mobile No :" + data));
	}

}
