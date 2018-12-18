package itcs_16_7_Stasiuk;

import java.util.Calendar;
import java.util.Date;

public class User {
	private Long id;
	private String firstName;
	private String lastName;
	private Date dateOfBirthd;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirthd() {
		return dateOfBirthd;
	}

	public void setDateOfBirthd(Date dateOfBirthd) {
		Date temp =new Date(0);
		temp.setDate(dateOfBirthd.getDate());
		temp.setYear(dateOfBirthd.getYear());
		temp.setMonth(dateOfBirthd.getMonth());
		this.dateOfBirthd = temp;
	}

	public Object getFullName() {
		return getLastName() + ", " + getFirstName();
	}

	public Object getAge() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int currentYear = calendar.get(Calendar.YEAR);
		calendar.setTime(getDateOfBirthd());
		return currentYear - calendar.get(Calendar.YEAR);
	}

}
