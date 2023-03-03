package model;

public class Professor {
	//1. variables
	private long id;
	private String name;
	private String surname;
	private Faculty faculty;
	private String degree;
	
	private static long professorCounter = 0;
	//2. getters setters
	public long getId() {
		return id;
	}
	public void setId() {
		id = professorCounter++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null && name.matches("([A-ZĀČĒĢĪĶĻŅŠŪŽ]){1}[a-zāčēģīķļņšūž]+[ ]?")) {
			this.name = name;
		} else {
			this.name = "Unknown";
		}
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		if(surname != null && surname.matches("([A-ZĀČĒĢĪĶĻŅŠŪŽ]){1}[a-zāčēģīķļņšūž]+[ ]?")) {
			this.surname = surname;
		} else {
			this.surname = "Unknown";
		}
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty inputFaculty) {
		if(inputFaculty != null) {
			faculty = inputFaculty;
		} else {
			faculty = Faculty.other;
		}
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	//3. constructors
	//4. to string
	//5. other functions
}
