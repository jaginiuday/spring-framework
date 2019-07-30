package com.examples.annotations.autowiring.onconstructor;

import org.springframework.beans.factory.annotation.Autowired;

import com.examples.annotations.autowiring.Department;

public class Employee {

	private Department department;

	@Autowired
	public Employee(Department department) {
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
