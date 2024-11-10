package com.xworkz.stringExample.main;

public class StringMethodsRunner {

	public static void main(String[] args) {

		String ref= "Xworkz-odc, Rajajinagar";
		
		// 1.length method
		System.out.println(ref.length());
		
		// 2.charAt(index)
		System.out.println(ref.charAt(12));
		
		// 3.subSequence(start, endIndex)
		System.out.println(ref.subSequence(0, 6));
		
		// 4.toUpperCase
		System.out.println(ref.toUpperCase());
		
		// 5.toLowerCase
		System.out.println(ref.toLowerCase());
		
		// 6.trim()
		System.out.println(ref.trim());
		
		// 7.replace(target, replace)
		System.out.println(ref.replace("Xworkz", "X-Workz"));
		
		// 8.indexOf(String ref)
		System.out.println(ref.indexOf("Rajajinagar"));
		
		//9.lastIndexOf(Char c)
		System.out.println(ref.lastIndexOf('c'));
		
		// 10. contains() check:true/false
		System.out.println("Contains :"+ref.contains(ref));
		
		// 11.startsWith
		System.out.println("Starts With :"+ref.startsWith("X"));
		
		//12.endsWith
		System.out.println("Ends With :"+ref.endsWith("r"));
		
		//13. valueOf
		System.out.println("Value Of :"+ref.valueOf(ref));
		
		//14. isEmpty
		System.out.println("Empty :"+ref.isEmpty());
		
		// 15.compareTo 
		String str="Xworkz-odc, Rajajinagar";
		System.out.println("compare :"+ref.compareTo(str));
		
		// 16. compareToIgnoreCase
		System.out.println(ref.compareToIgnoreCase(str));
		
		// 17. concat
		System.out.println(ref.concat("--New Batch Available now"));
	}
	

}
