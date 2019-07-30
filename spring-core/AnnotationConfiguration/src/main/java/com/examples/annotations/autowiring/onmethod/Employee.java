package com.examples.annotations.autowiring.onmethod;

import org.springframework.beans.factory.annotation.Autowired;

import com.examples.annotations.autowiring.Department;

public class Employee {

	private Department department;

	public Department getDepartment() {
		return department;
	}

	@Autowired
	public void setDepartment(Department department) {
		this.department = department;
	}
}
