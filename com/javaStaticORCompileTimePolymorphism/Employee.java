package com.javaStaticORCompileTimePolymorphism;

public class Employee {

	private int employeeId;
	private String employeeName;
	private String employeeRole;
	private double employeeSalary;

	// Polymorphism applied on constructor
	// constructor overloading
	public Employee() {
		employeeId = 202;
		employeeName = "Neha";
		employeeRole = "SD";
		employeeSalary = 7698.09;
	}

	public Employee(int employeeId, String employeeName, String employeeRole, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
		this.employeeSalary = employeeSalary;
	}

	public void getDetails() {
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(employeeRole);
		System.out.println(employeeSalary);

	}

}
