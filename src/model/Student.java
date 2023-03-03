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
		if(name.matches("([A-ZĀČĒĢĪĶĻŅŠŪŽ]){1}[a-zāčēģīķļņšūž]+")) {
			this.name = name;
		} else {
			this.name = "Unknown";
		}
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	public void setPersonCode(String personCode) {
		this.personCode = personCode;
	}
	
	
	//3. constructors
	
	//4. to String

	//5. additional functions
}
