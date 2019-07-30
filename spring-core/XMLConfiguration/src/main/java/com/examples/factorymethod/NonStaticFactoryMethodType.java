package com.examples.factorymethod;

public class NonStaticFactoryMethodType {
	private static final NonStaticFactoryMethodType obj = new NonStaticFactoryMethodType();

	public NonStaticFactoryMethodType getNonStaticFactoryMethodType() {
		System.out.println("factory method ");
		return obj;
	}

	public void msg() {
		System.out.println("hellow this NonStaticFactoryMethodType class msg method");
	}
}
