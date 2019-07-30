package com.examples.factorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NonStaticFactoryMethodTypeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("factorymethod/nonStaticFactoryMethodType.xml");

		NonStaticFactoryMethodType nonStaticFactoryMethodType = (NonStaticFactoryMethodType) context.getBean("nonStaticFactoryMethodType");
		nonStaticFactoryMethodType.msg();
	}

}
