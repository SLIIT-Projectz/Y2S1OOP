package Question1;

public abstract class Course {
	String code;
	String courseName;
	
	public Course() {
		this.code = "";
		this.courseName = "";
	}
	
	public Course(String code, String courseName) {
		this.code = code;
		this.courseName = courseName;
	}
	
	public abstract void DisplayCourseDetails();

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
}
