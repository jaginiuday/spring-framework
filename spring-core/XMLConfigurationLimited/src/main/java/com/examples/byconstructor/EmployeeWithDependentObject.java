package com.examples.byconstructor;

public class EmployeeWithDependentObject {

	private int id;
	private String name;
	private Address address;

	public EmployeeWithDependentObject(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void show() {
		System.out.println(id + " " + name);
		System.out.println(address.toString());
	}
}
