package itcs_16_7_Stasiuk.db;

import static org.junit.Assert.*;

import org.junit.Test;

import itcs_16_7_Stasiuk.db.DaoFactory;
import itcs_16_7_Stasiuk.db.UserDao;

public class DaoFactoryTest {

	@Test
	public void testGetUserDao() {
		try {
			DaoFactory daoFactory = DaoFactory.getInstance();
			assertNotNull("DaoFactory instance is null!",daoFactory);
			UserDao userDao = daoFactory.getUserDao();
			assertNotNull("UserDao instance is null!",userDao);
		} catch (RuntimeException e) {
			e.printStackTrace();
			fail(e.toString());
		}
	}

}
