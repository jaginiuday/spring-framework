package com.examples.annotations.autowiring.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/qualifier.xml");

		MySqlConnector mySqlConnector = (MySqlConnector) context.getBean("mySqlConnector");		
		mySqlConnector.connect();
		
		System.out.println("\n");
		
		OracleConnector oracleConnector = (OracleConnector) context.getBean("oracleConnector");
		oracleConnector.connect();
	}

}
