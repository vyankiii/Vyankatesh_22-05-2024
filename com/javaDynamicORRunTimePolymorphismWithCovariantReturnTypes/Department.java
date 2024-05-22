package com.javaDynamicORRunTimePolymorphismWithCovariantReturnTypes;

public class Department {

	private int departmentId;
	private String departmentName;

	public Department() {
		departmentId = 20;
		departmentName = "Development";
	}

	public Department(int departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public Department getDetails() {

		System.out.println(departmentId);
		System.out.println(departmentName);

		return null;

	}
}
