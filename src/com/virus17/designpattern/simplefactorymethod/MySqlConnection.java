package com.virus17.designpattern.simplefactorymethod;

public class MySqlConnection implements DatabaseConnection {

	@Override
	public void closeConnection() {
		System.out.println("Closing Connection to MySql database");
	}

	@Override
	public void executeQuery() {
		System.out.println("Executing Query against MySql database");
	}

}
