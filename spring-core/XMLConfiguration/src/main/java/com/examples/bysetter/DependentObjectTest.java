package com.examples.bysetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependentObjectTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bysetter/dependentObject.xml");

		EmployeeWithDependentObject employeeWithDependentObject = (EmployeeWithDependentObject) context.getBean("employeeWithDependentObject");
		employeeWithDependentObject.show();
	}

}
