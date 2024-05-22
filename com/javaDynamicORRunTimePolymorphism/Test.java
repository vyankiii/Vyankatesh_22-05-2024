package com.javaDynamicORRunTimePolymorphism;

public class Test {

	public static void main(String[] args) {

		Department department = new Department(11, "SE");
		department.getDetails();

		Employee employee = new Employee(10, "Vijay", "BA", 90757.8);
		employee.getDetails();

	}

}
