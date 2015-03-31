package com.virus17.designpattern.simplefactorymethod;

public class OracleConnection implements DatabaseConnection{

	@Override
	public void closeConnection() {
		System.out.println("Closing Connection to Oracle database");
	}

	@Override
	public void executeQuery() {
		System.out.println("Executing Query against Oracle database");
	}

}
