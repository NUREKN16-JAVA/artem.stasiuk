package com.artem.stasiuk.db;

import java.util.Collection;

import com.artem.stasiuk.User;

public interface UserDao {
	User create(User user) throws DatabaseException;

	User update(User user) throws DatabaseException;

	User delete(User user) throws DatabaseException;

	User find(Long id) throws DatabaseException;

	Collection findAll() throws DatabaseException;
	
	Collection findAll(String firstName, String lastName) throws DatabaseException;
	
	void setConnectionFactory(ConnectionFactory connectionFactory);
}
