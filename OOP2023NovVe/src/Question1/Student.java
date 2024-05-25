package Question1;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
	List<Course> enrolledCourses;
	
	public Student() {
		this.enrolledCourses.add(null);
	}
	
	public Student(int ID, String name) {
		super(ID, name);
		this.enrolledCourses = new ArrayList<>();
	}
	
	public void DisplayDetails() {
		System.out.println("Student ID : " + this.ID);
		System.out.println("Student Name : " + this.name);
		System.out.println("Enrolled Courses : ");
		for(Course c: enrolledCourses) {
			c.DisplayCourseDetails();;
		}
		
	}
	
	public void EnrollInCourses(Course c) {
		this.enrolledCourses.add(c);
	}

}
