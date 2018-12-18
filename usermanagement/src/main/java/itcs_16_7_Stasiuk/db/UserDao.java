package itcs_16_7_Stasiuk.db;

import java.util.Collection;

import itcs_16_7_Stasiuk.User;

public interface UserDao {
	User create(User user) throws DatabaseException;

	User update(User user) throws DatabaseException;

	User delete(User user) throws DatabaseException;

	User find(Long id) throws DatabaseException;

	Collection findAll() throws DatabaseException;
	
	void setConnectionFactory(ConnectionFactory connectionFactory);
}
