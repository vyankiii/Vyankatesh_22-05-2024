package com.javaDynamicORRunTimePolymorphismWithCovariantReturnTypes;

public class Test {

	public static void main(String[] args) {

		Department department = new Department(101, "SE");
		department.getDetails();

		Employee employee = new Employee(102, "Ram", "BA", 876.98);
		employee.getDetails();

	}

}
