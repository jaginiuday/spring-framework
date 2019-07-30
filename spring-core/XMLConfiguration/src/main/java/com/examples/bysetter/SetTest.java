package com.examples.bysetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bysetter/set.xml");
		QuestionWithSet questionWithSet = (QuestionWithSet) context.getBean("questionWithSet");
		questionWithSet.displayInfo();
	}
}
