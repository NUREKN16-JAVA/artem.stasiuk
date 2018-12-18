package itcs_16_7_Stasiuk.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactoryImpl implements ConnectionFactory {
	
	private String driver;
	private String url;
	private String user;
	private String password;

	public ConnectionFactoryImpl(String driver, String url, String user, String password) {
		this.user = user;
		this.password = password;
		this.url = url;
		this.driver = driver;	
		
		
	}

	@Override
	public Connection createConnection() throws DatabaseException {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new DatabaseException(e);
		}
	}

}
