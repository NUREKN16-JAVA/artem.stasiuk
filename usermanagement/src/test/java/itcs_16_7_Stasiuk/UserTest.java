package itcs_16_7_Stasiuk;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import itcs_16_7_Stasiuk.User;
import junit.framework.TestCase;

public class UserTest extends TestCase {

	private User user;
	private Date dateOfBirthd;

	@Before
	protected void setUp() throws Exception {
		super.setUp();

		user = new User();
		Calendar calendar = Calendar.getInstance();
		calendar.set(1999, Calendar.MAY, 7);
		dateOfBirthd = calendar.getTime();
	}

	@Test
	public void testGetFullName() {
		user.setFirstName("Artem");
		user.setLastName("Stasiuk");
		assertEquals("Stasiuk, Artem", user.getFullName());
	}

	@Test
	public void testGetAge() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int currentYear = calendar.get(Calendar.YEAR);
		user.setDateOfBirthd(dateOfBirthd);
		assertEquals(currentYear - 1999, user.getAge());
	}
}
