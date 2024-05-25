package Question2;

public class SupplierIron extends Thread{
	private final Object lock;
	
	public SupplierIron(Object lock) {
		this.lock = lock;
	}
	
	public void run() {
		synchronized(lock) {
			while(true) {
				System.out.print("Supplied 1 Iron.");
				FactorySimulation.incrementIron();
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
