package com.examples.byconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("byconstructor/map.xml");
		QuestionWithMap questionWithMap = (QuestionWithMap) context.getBean("questionWithMap");
		questionWithMap.displayInfo();
	}
}
