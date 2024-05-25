package Question2;

public class SupplierCement extends Thread{
	private final Object lock;
	
	public SupplierCement(Object lock) {
		this.lock = lock;
	}
	
	public void run() {
		synchronized(lock) {
			while(true) {
				System.out.print("Supplied 1 Cement.");
				FactorySimulation.incrementCement();
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
