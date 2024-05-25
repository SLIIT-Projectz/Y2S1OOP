package Question4;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
	List<Course> enrolledCourses = new ArrayList<>();
	
	public Student() {
		super();
	}
	
	public Student(int id, String name) {
		super(id, name);
	}

	public void EnrolledInCourse(Course c) {
		this.enrolledCourses.add(c);
	}

	@Override
	public void DisplayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Student ID : " + this.id);
		System.out.println("Student Name : " + this.name);
		System.out.println("Student Enrolled Courses : ");
		
		for(Course c: enrolledCourses) {
			c.DisplayCourseDetails();
		}
	}

}
