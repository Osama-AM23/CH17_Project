package com.xworkz.stringExample.main;

import com.xworkz.stringExample.intrenal.Student;

public class StudentRunner {

	public static void main(String[] args) {
	
		Student student= new Student("Aswin");
		System.out.println("HashCode of Student :"+student.hashCode());

		Student student1=new Student("aswin");
		System.out.println("hashCode of Student1 :"+student1.hashCode());
		
		boolean eql=student.equals(student1);
		System.out.println("Equal :"+eql);
		
		if(student==student1) {
			System.out.println("Same");
		}else {
			System.out.println("Not same");
		}
		System.out.println("-------------------------------");
		
		String ref="Osama";
		String ref1="Osama";
		
		boolean same=ref.equals(ref1);
		System.out.println("Same :"+same);
		
		if(ref==ref1) {
			System.out.println("Same ");
		}else {
			System.out.println("Not Same");
		}
	}

}
