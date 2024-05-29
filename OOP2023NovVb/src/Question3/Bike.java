package Question3;

public class Bike implements Runnable {
	private Object lock;
	
	
	public Bike(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			for(int i = 0; i<5; i++) {
				System.out.println("Bike is racing");
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
