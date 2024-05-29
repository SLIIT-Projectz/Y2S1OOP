package Question3;

public class RaceRunner {
	private static Object lock = new Object();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th1 = new Thread(new Car(lock));		
		Thread th2 = new Thread(new Bike(lock));
		th1.start();
		th2.start();
	}

}
