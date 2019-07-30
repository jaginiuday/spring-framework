package com.examples.annotations.autowiring.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class OracleConnector {

	@Autowired
	@Qualifier("oracleConnection")
	private IConnection connection;
	
	public void connect() {
		connection.getConnection();
	}
}
