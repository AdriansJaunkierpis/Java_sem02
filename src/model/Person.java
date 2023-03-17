package model;

public class Person {
	private String name;
	private String surname;
	private String personCode;
	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getPersonCode() {
		return personCode;
	}
	
	public void setName(String name) {
		if(name != null && name.matches("([A-ZĀČĒĢĪĶĻŅŠŪŽ]){1}[a-zāčēģīķļņšūž]+[ ]?")) {
			this.name = name;
		} else {
			this.name = "Unknown";
		}
	}
	public void setSurname(String surname) {
		if(surname != null && surname.matches("([A-ZĀČĒĢĪĶĻŅŠŪŽ]){1}[a-zāčēģīķļņšūž]+[ ]?")) {
			this.surname = surname;
		} else {
			this.surname = "Unknown";
		}
	}
	//([0-9]{6}[-][0-9]{5})|(32{1}[0-9]{9})
		public void setPersonCode(String personCode) {
			if (personCode != null && personCode.matches("([0-9]{6}[-][0-9]{5})")) {
				this.personCode = personCode;
			} else {
				this.personCode = "Unknown";
			}
		}
	
		public Person() {
			setName("Unknown");
			setSurname("Surname");
			setPersonCode("000000-00000");
		}
		public Person(String name, String surname, String personCode) {
			setName(name);
			setSurname(surname);
			setPersonCode(personCode);
		}
		
		public String toString() {
			return name + " " + surname + " " + personCode;
		}
}
