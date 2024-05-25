package Question1;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
	List<Course> coursesTaught;
	
	public Teacher() {
		this.coursesTaught.add(null);
	}
	
	public Teacher(int ID, String name) {
		super(ID, name);
		this.coursesTaught = new ArrayList<>();
	}
	
	public void TeachCourse(Course c) {
		coursesTaught.add(c);
	}
	public void DisplayDetails() {
		System.out.println("Teacher ID : " + this.ID);
		System.out.println("Teacher Name : " + this.name);
		System.out.println("Courses Teach : ");
		
		for(Course c: coursesTaught) {
			c.DisplayCourseDetails();;
		}
	}

}
