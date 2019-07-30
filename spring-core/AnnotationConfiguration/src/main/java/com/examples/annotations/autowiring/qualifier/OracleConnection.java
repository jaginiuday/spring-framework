package com.examples.annotations.autowiring.qualifier;

public class OracleConnection implements IConnection {

	public void getConnection() {
		System.out.println("Connected to Oracle Database");
	}
}
