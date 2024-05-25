package Question2;

public class ProductionLine extends Thread {
	private final Object lock;
	
	public ProductionLine(Object lock) {
		this.lock = lock;
	}
	
	public void run() {
		synchronized(lock) {
			while(true) {
				if(FactorySimulation.getTotIron() > 1 && FactorySimulation.getTotWood() > 2 && FactorySimulation.getTotCement() > 1) {
					System.out.println("Product produced.");
					FactorySimulation.decrementIron();
					FactorySimulation.decrementWood();
					FactorySimulation.decrementCement();
					lock.notifyAll();
				}
				try {
					Thread.sleep(1000);
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
