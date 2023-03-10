package model;

public class Course {
	//1 variables
	private long id;
	private String title;
	private int creditPoints; //min 1, max 20
	private CourseGradeType type; //not null
	private Professor professor; //not null
	private static long courseCounter = 12000;
	//2 getters setters
	public long getId() {
		return id;
	}
	public void setId() {
		id = courseCounter++;;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if (title != null && title.matches("[A-ZĀČĒĢĪĶĻŅŠŪŽ]{1}[a-zāčēģīķļņšūžA-ZĀČĒĢĪĶĻŅŠŪŽ0-9\\s]+")) {
			this.title = title;
		} else {
			this.title = "Unknown";
		}
	}
	public int getCreditPoints() {
		return creditPoints;
	}
	public void setCreditPoints(int creditPoints) {
		if (creditPoints > 0 && creditPoints < 20) {
			this.creditPoints = creditPoints;
		} else {
			this.creditPoints = 2;
		}
	}
	public CourseGradeType getType() {
		return type;
	}
	public void setType(CourseGradeType type) {
		if (type != null) {
			this.type = type;
		} else {
			this.type = CourseGradeType.other;
		}
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		if (professor != null) {
			this.professor = professor;
		} else {
			this.professor = new Professor();
		}
	}
	
	//3 constructors
	public Course() {
		setId();
		setTitle("Unknown");
		setCreditPoints(2);
		setType(CourseGradeType.other);
		setProfessor(new Professor());
	};
	
	public Course(String title, int creditPoints, CourseGradeType type, Professor professor) {
		setId();
		setTitle(title);
		setCreditPoints(creditPoints);
		setType(type);
		setProfessor(professor);
	};
	//4 toString
	public String toString() {
		return "" + id + ": " + title + ", KP:" + creditPoints + ", " + ", " + type + ", Prof.: " + professor.getName() + " " + professor.getSurname();
	}
	//5 additional functions
}
