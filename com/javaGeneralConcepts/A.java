package com.javaGeneralConcepts;

//Main method overloading is possible
//Main method overiding is not possible
public class A {
	public static void main() {

		System.out.println("main method without parameters");
//		main();
//		String array[]= {"a","b"};

	}

//static belongs to class
	public static void main(String[] args) {

		System.out.println("main method with parameters");
		main();
	}

}
