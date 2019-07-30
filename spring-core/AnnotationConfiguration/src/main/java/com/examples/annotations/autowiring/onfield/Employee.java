package com.examples.annotations.autowiring.onfield;

import org.springframework.beans.factory.annotation.Autowired;

import com.examples.annotations.autowiring.Department;

public class Employee {

	@Autowired
	private Department department;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
