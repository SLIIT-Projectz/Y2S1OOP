package Question3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TResources = 3;
		int TUsers = 5;
		ResourceManager rm = new ResourceManager(TResources);
		
		
		for(int i = 1; i<= TUsers; i++) {
			User userThread = new User(i, rm);
			userThread.start();
		}

	}

}
