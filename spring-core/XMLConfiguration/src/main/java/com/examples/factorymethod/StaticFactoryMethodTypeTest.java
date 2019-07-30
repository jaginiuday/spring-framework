package com.examples.factorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StaticFactoryMethodTypeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("factorymethod/staticFactoryMethodType.xml");

		StaticFactoryMethodType staticFactoryMethodType = (StaticFactoryMethodType) context.getBean("staticFactoryMethodType");
		staticFactoryMethodType.msg();
	}

}
