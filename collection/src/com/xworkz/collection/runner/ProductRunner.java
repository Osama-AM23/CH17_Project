package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.ProductDTO;

public class ProductRunner {

	public static void main(String[] args) {
		ProductDTO product = new ProductDTO(1, "Iphone15", "Chethan", 80000);
		ProductDTO product2 = new ProductDTO(2, "Water Bottle", "Nagaraj", 200);
		ProductDTO product3 = new ProductDTO(3, "Television", "Saqib", 12000);
		ProductDTO product4 = new ProductDTO(4, "Clothes", "Osama", 600);
		ProductDTO product5 = new ProductDTO(5, "Sofa", "Arun", 8000);
		ProductDTO product6 = new ProductDTO(6, "Helmet", "Suhas", 2800);
		ProductDTO product7 = new ProductDTO(7, "Ev Stove", "Abbaas", 6000);
		ProductDTO product8 = new ProductDTO(8, "InnerWear", "Akash", 300);
		ProductDTO product9 = new ProductDTO(9, "Colling Glass", "Mujahid", 500);
		ProductDTO product10 = new ProductDTO(10, "Laptop", "Deepak", 50000);

		Collection<ProductDTO> collection = new ArrayList<ProductDTO>();
		collection.add(product);
		collection.add(product2);
		collection.add(product3);
		collection.add(product4);
		collection.add(product5);
		collection.add(product6);
		collection.add(product7);
		collection.add(product8);
		collection.add(product9);
		collection.add(product10);

		collection.stream().forEach(pro -> System.out.println(pro));

		System.out.println("--- sorted ---");
		// Stream the collection, sort the elements in their natural order, and print
		// each sorted element to the console
		collection.stream().sorted().forEach(dto -> System.out.println(dto));

		System.out.println("---sorted greather than 5000---");
		// Stream the collection, filter the products to include only those with a cost
		// greater than 5000, and print each matching product to the console
		collection.stream().filter(ref -> ref.getCost() > 5000).forEach(cost -> System.out.println(cost));

		System.out.println("---sorted greater than 5000 & less than 30000---");
		// Stream the collection, filter products with a cost greater than 5000 and less
		// than 30000, and print each matching product to the console
		collection.stream().filter((ref) -> ref.getCost() > 5000 && ref.getCost() < 30000)
				.forEach(cost -> System.out.println(cost));

		System.out.println("---sorted in Descending by Cost---");
		// Stream the collection, sort the products in descending order based on their
		// cost, and print each sorted product to the console
		collection.stream().sorted((dto1, dto2) -> Double.compare(dto2.getCost(), dto1.getCost()))
				.forEach(dto -> System.out.println(dto));

		System.out.println("---Vendor name startWith 'A'-- sorted by Ascending---");
		// Stream the collection, sort the products in their natural order, filter for
		// products where the vendor's name starts with 'A', and print each matching
		// product to the console
		collection.stream().sorted().filter(ref -> ref.getVendor().startsWith("A"))
				.forEach(con -> System.out.println(con));

		System.out.println("---Sorted by id and cost---");
		// Stream the collection, sort the products by their ID in ascending order,
		// collect the sorted products into a list, and print each product to the
		// console
		collection.stream().sorted((dto1, dto2) -> Integer.compare(dto1.getId(), dto2.getId()))
				.collect(Collectors.toList()).forEach(ref -> System.out.println(ref));

		System.out.println("-------------");
		// Stream the collection, sort the products by their ID in descending order, and
		// print each sorted product to the console
		collection.stream().sorted((dto1, dto2) -> Integer.compare(dto2.getId(), dto1.getId()))
				.forEach(ref -> System.out.println(ref));

		System.out.println("-------------");
		// Stream the collection, sort the products by their cost in descending order,
		// and print each sorted product to the console
		collection.stream().sorted((dto1, dto2) -> Double.compare(dto2.getCost(), dto1.getCost()))
				.forEach(ref -> System.out.println(ref));

		System.out.println("-------------");
		// Stream the collection, sort the products by their cost in ascending order,
		// and print each sorted product to the console
		collection.stream().sorted((dto1, dto2) -> Double.compare(dto1.getCost(), dto2.getCost()))
				.forEach(ref -> System.out.println(ref));

		System.out.println("--name from product--");
		// Stream the collection, extract the names of the products, and print each name
		// to the console
		collection.stream().map(pro -> pro.getName()).forEach(print -> System.out.println(print));

		System.out.println("--id's from product--");
		// Stream the collection, extract the IDs of the products, and print each ID to
		// the console
		collection.stream().map(pro -> pro.getId()).forEach(print -> System.out.println(print));

		System.out.println("--Product name by upper case--");
		// Stream the collection, convert the names of the products to upper case, and
		// print each upper case name to the console
		collection.stream().map(caps -> caps.getName().toUpperCase()).forEach(give -> System.out.println(give));
	}

}
