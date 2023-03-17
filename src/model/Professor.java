package model;

public class Professor extends Person {
	//1. variables
	private long id;
	private Faculty faculty;
	private Degree degree;
	
	private static long professorCounter = 0;
	//2. getters setters
	public long getId() {
		return id;
	}
	public void setId() {
		id = professorCounter++;
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
	public Degree getDegree() {
		return degree;
	}
	public void setDegree(Degree inputDegree) {
		if(inputDegree != null) {
			degree = inputDegree;
		} else {
			degree = Degree.other;
		}
	}
	
	//3. constructors
	public Professor() {
		super();
		setId();
		setFaculty(Faculty.other);
		setDegree(Degree.other);
	};
	public Professor(String name, String surname, Faculty faculty, String personCode) {
		super(name, surname, personCode);
		setId();
		setFaculty(faculty);
		setDegree(degree);
	};
	//4. to string
	public String toString() {
		return "" + id + ": " + super.toString() + ", " + ", " + faculty + ", " + degree;
	}
	//5. other functions
}
