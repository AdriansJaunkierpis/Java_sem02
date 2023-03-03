package model;

public class Student {
	//1. variables
	private long id;
	private String name;
	private String surname;
	private Faculty faculty;
	private String personCode;
	
	//2. get and set
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public String getPersonCode() {
		return personCode;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	//TODO check out regex ([A-ZĀČĒĢĪĶĻŅŠŪŽ]){1}[a-zāčēģīķļņšūž]+
	public void setName(String name) {
		if(name.matches("([A-ZĀČĒĢĪĶĻŅŠŪŽ]){1}[a-zāčēģīķļņšūž]+[ ]?([A-ZĀČĒĢĪĶĻŅŠŪŽ]){1}[a-zāčēģīķļņšūž]+")) {
			this.name = name;
		} else {
			this.name = "Unknown";
		}
	}
	public void setSurname(String surname) {
		if(surname.matches("([A-ZĀČĒĢĪĶĻŅŠŪŽ]){1}[a-zāčēģīķļņšūž]+[-]?([A-ZĀČĒĢĪĶĻŅŠŪŽ]){1}[a-zāčēģīķļņšūž]+")) {
			this.surname = surname;
		} else {
			this.surname = "Unknown";
		}
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	//([0-9]{6}[-][0-9]{5})?(32{1}[0-9]{9})
	public void setPersonCode(String personCode) {
		if (personCode.matches("([0-9]{6}[-][0-9]{5})")) {
			this.personCode = personCode;
		} else {
			this.personCode = "Unknwon";
		}
	}
	
	
	//3. constructors
	
	//4. to String

	//5. additional functions
}
