package Question4;

public class concreteCourse extends Course {
	public concreteCourse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public concreteCourse(String code, String courseName) {
		super(code, courseName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void DisplayCourseDetails() {
		// TODO Auto-generated method stub
		System.out.println("Course ID : " + this.code);
		System.out.println("Course Name : " + this.courseName);
	}

}
