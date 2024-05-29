package Question3;

public class Car implements Runnable {
private Object lock;
	
	
	public Car(Object lock) {
		super();
		this.lock = lock;
	}
	
	@Override
	public void run() {
		
		synchronized (lock) {
			for(int i = 0; i<5; i++) {
				System.out.println("Car is racing");
			}
			
			try {
				lock.notify();
				lock.wait();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
