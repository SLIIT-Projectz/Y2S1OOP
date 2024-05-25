package Question2;

public class SupplierWood extends Thread{
	private final Object lock;
	
	public SupplierWood(Object lock) {
		this.lock = lock;
	}
	
	public void run() {
		synchronized(lock) {
			while(true) {
				System.out.print("Supplied 1 Wood.");
				FactorySimulation.incrementWood();
				lock.notifyAll();
				try {
					Thread.sleep(600);
//					lock.notify();
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
