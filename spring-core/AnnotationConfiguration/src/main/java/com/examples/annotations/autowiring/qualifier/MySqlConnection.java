package com.examples.annotations.autowiring.qualifier;

public class MySqlConnection implements IConnection {

	public void getConnection() {
		System.out.println("Connected to MySql Database");
	}
}
