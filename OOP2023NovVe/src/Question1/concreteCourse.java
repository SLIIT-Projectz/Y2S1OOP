package Question1;

public class concreteCourse extends Course{
	
	public concreteCourse() {
		super();
	}
	
	public concreteCourse(String code, String name) {
		super(code, name);
	}

	public void DisplayCourseDetails() {
		System.out.println("Course code : " + this.getCode());
		System.out.println("Course name : " + this.getCourseName());
	}

}
