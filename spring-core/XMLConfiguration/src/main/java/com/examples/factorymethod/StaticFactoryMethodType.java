package com.examples.factorymethod;

public class StaticFactoryMethodType {
	private static final StaticFactoryMethodType obj = new StaticFactoryMethodType();

	private StaticFactoryMethodType() {
		System.out.println("private constructor");
	}

	public static StaticFactoryMethodType getStaticFactoryMethodType() {
		System.out.println("factory method ");
		return obj;
	}

	public void msg() {
		System.out.println("hellow this StaticFactoryMethodType class msg method");
	}
}
