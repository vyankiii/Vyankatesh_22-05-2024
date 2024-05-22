package com.javaStaticORCompileTimePolymorphism;

public class Department {

	private int departmentId;
	private String departmentName;

	public Department() {
		departmentId = 29;
		departmentName = "Development";
	}

	// method overloading
	// zero parameter
	public void getDetails() {
		System.out.println(departmentId);
		System.out.println(departmentName);
	}

	// one parameters
	public void getDetails(int departmentId) {
		// set the value
		this.departmentId = departmentId;
		// print the value
		System.out.println(departmentId);
		System.out.println(departmentName);
	}

	// two parameters
	public void getDetails(int departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;

		System.out.println(departmentId);
		System.out.println(departmentName);
	}

}
