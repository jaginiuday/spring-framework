package com.examples.bysetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bysetter/list.xml");
		QuestionWithList questionWithList = (QuestionWithList) context.getBean("questionWithList");
		questionWithList.displayInfo();
	}
}
