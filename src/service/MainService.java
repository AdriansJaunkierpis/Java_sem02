package service;

import model.Degree;
import model.Faculty;
import model.Grade;
import model.CourseGradeType;
import model.Student;
import model.Professor;

import java.util.ArrayList;
import java.util.Arrays;

import model.Course;

public class MainService {
	
	private static ArrayList<Student> allStudentsList = new ArrayList<>();
	private static ArrayList<Professor> allProfessorsList = new ArrayList<>();
	private static ArrayList<Course> allCoursesList = new ArrayList<>();
	private static ArrayList<Grade> allGradesList = new ArrayList<>();

	public static void main(String[] args) {
		
		//TODO create 4 arrays, one for each and add all elements
		//TODO print out all elements
		Professor[] allProfessors = new Professor[6];
		Course[] allCourses = new Course[6];
		Grade[] allGrades = new Grade[6];
		
		Student st1 = new Student();
		Student st2 = new Student("Harvey", "Bērziņš", Faculty.ITF, "131199-12345");
		Student st3 = new Student("Andris", "Cielavs", Faculty.ITF, "13z199-12345");
		/*Student[] allStudents = {st1, st2, st3};
		for(Student temp : allStudents) {
			System.out.println(temp);
		}*/
		
		allStudentsList.addAll(Arrays.asList(st1, st2, st3));
		for(Student temp : allStudentsList) {
			System.out.println(temp);
		}
		
		Professor pr1 = new Professor();
		Professor pr2 = new Professor("Karina", "Skirmante", Faculty.ITF, "121212-11123");
		Professor pr3 = new Professor("Galina", "Hilkevica", Faculty.ITF, "814532-32557");
		
		allProfessorsList.addAll(Arrays.asList(pr1, pr2, pr3));
		for(Professor temp : allProfessorsList) {
			System.out.println(temp);
		}
		
		Course c1 = new Course();
		Course c2 = new Course("Programmesana timekli JAVA", 4, CourseGradeType.EXAM, pr2);
		Course c3 = new Course("Matematika", 2, CourseGradeType.EXAM, pr3);
		Course c4 = new Course("DataStrukt", 2, CourseGradeType.EXAM, pr2);
		
		allCoursesList.addAll(Arrays.asList(c1, c2, c3, c4));
		for(Course temp : allCoursesList) {
			System.out.println(temp);
		}
		
		Grade g1 = new Grade();
		Grade g2 = new Grade(10, st2, c2);
		Grade g3 = new Grade(1, st3, c3);
		Grade g4 = new Grade(6, st3, c2);
		
		allGradesList.addAll(Arrays.asList(g1, g2, g3, g4));
		for(Grade temp : allGradesList) {
			System.out.println(temp);
		}
		
		System.out.println("----------------------------");
		
		for (Student temp : allStudentsList) {
			System.out.println(temp.getName() + ": " + calculateAVGGrade(temp));
		}
		System.out.println("----------------------------");
		for (Course temp : allCoursesList) {
			System.out.println(temp.getTitle() + ": " + calculateCourseAVGGrade(temp));
		}
	}
	private static float calculateAVGGrade(Student student) {
		if (student != null) {
			int gradesSum = 0;
			int gradesCounter = 0;
			
			for (Grade temp : allGradesList) {
				if (temp.getStudent().equals(student)) {
					gradesSum += temp.getGradeValue();
					gradesCounter++;
				}
			} // float/int = float
			//int / float = float
			return ((float)gradesSum)/gradesCounter;
		} else {
			return 0;
		}
	}
	
	private static float calculateCourseAVGGrade(Course course) {
		if (course != null) {
			int gradesSum = 0;
			int gradesCounter = 0;
			
			for (Grade temp : allGradesList) {
				if (temp.getCourse().equals(course)) {
					gradesSum += temp.getGradeValue();
					gradesCounter++;
				}
			} 
			return ((float)gradesSum)/gradesCounter;
		} else {
			return 0;
		}
	}
}
