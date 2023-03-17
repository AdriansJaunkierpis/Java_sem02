package model;

public class Student extends Person {
	//1. variables
	private long id;
	private Faculty faculty;
	
	private static long studentCounter = 0;
	
	//2. get and set
	public long getId() {
		return id;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	
	public void setId() {
		id = studentCounter++;
	}
	public void setFaculty(Faculty inputFaculty) {
		if(inputFaculty != null) {
			faculty = inputFaculty;
		} else {
			faculty = Faculty.other;
		}
	}
	
	//3. constructors
	public Student() {
		super(); //will call Person()
		setId();
		setFaculty(Faculty.other);
	};
	public Student(String name, String surname, Faculty faculty, String personCode) {
		super(name, surname, personCode); //will call Person(String name, String surname, String personCode)
		setId();
		setFaculty(faculty);
	};
	//4. to String
	public String toString() {
		return "" + id + ": " + super.toString() + ", " + faculty;
	}
	//5. additional functions
}
