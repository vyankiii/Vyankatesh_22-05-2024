package com.javaStaticORCompileTimePolymorphism;

public class TestDepartment {

	public static void main(String[] args) {

		Department department1 = new Department();
		department1.getDetails();

		Department department2 = new Department();
		department2.getDetails(100);

		Department department3 = new Department();
		department3.getDetails(99, "Software Engineering");

	}

}
