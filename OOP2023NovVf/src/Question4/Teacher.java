package Question4;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
	List<Course> courseTaught = new ArrayList<>();
	
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Teacher(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public void TeachCourse(Course c) {
		courseTaught.add(c);
	}

	@Override
	public void DisplayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Teacher ID : " + this.id);
		System.out.println("Teacher Name : " + this.name);
		System.out.println("Courses Teached : ");
		
		for(Course c: courseTaught) {
			c.DisplayCourseDetails();
		}
		
	}
	
}
