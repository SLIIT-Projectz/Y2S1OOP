package Question4;

public abstract class Person {
	int id;
	String name;
	
	public Person() {
		super();
		this.id = 0;
		this.name = "";
	}
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public abstract void DisplayDetails();
}
