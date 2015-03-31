package com.virus17.designpattern.simplefactorymethod;

public class ClientApp {

	public static void main(String[] args) throws Exception {
		DatabaseConnection connection;
		
		connection = ConnectionFactory.createConnection("oracle");
		connection.executeQuery();
		connection.closeConnection();
		
		connection = ConnectionFactory.createConnection("mysql");
		connection.executeQuery();
		connection.closeConnection();
		
		connection = ConnectionFactory.createConnection("SomeOtherDatabase");
		connection.executeQuery();
		connection.closeConnection();
	}

}
