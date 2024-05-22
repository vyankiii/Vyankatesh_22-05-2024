package com.javaStaticORCompileTimePolymorphism;

public class Test {

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.getDetails();

		Employee employee2 = new Employee();
		employee2.getDetails();

		Employee employee3 = new Employee(101, "Ajay", "SE", 76793.34);
		employee3.getDetails();

		Employee employee4 = new Employee(132, "Vijay", "BA", 99999.2);
		employee4.getDetails();

	}

}
