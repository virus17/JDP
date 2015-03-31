package com.virus17.designpattern.simplefactorymethod;

/**
 * A interface for database connections.
 * It will be implemented by classes like MySqlConnection, OracleConnection
 * for specific database.
 *  
 * @author sshant
 */
public interface DatabaseConnection {
	public void closeConnection();
	public void executeQuery();  //Update  or insert....kind of
}
