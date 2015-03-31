package com.virus17.designpattern.simplefactorymethod;

public class ConnectionFactory {
	public static DatabaseConnection createConnection(final String databaseType) throws Exception {
		if (databaseType.equals("oracle")) {
			return new OracleConnection();
		} else if (databaseType.equals("mysql")) {
			return new MySqlConnection();
		} else {
			throw new Exception ("there is no connection of type " + databaseType);
		}
	}
}
