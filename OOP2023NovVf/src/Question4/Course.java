package Question4;

public abstract class Course {
	String code, courseName;

	public Course() {
		super();
		this.code = "";
		this.courseName = "";
	}
	
	public Course(String code, String courseName) {
		super();
		this.code = code;
		this.courseName = courseName;
	}
	
	public abstract void DisplayCourseDetails();
}
