package Question3;

import java.util.ArrayList;

public class ProducerThread implements Runnable{
	private Object lock;
	private ArrayList<Integer> queue;
	
	public ProducerThread(ArrayList<Integer> queue, Object lock) {
		// TODO Auto-generated constructor stub
		this.queue = queue;
		this.lock = lock;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int value = 10;
		while(true) {
			
			synchronized (lock) {
				System.out.println("Producer started");
				System.out.println("Producer adding value = " + value + " to Queue");
				this.queue.add(value);
				value += 10;
				
				try {
					lock.notify();
					lock.wait();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
	
		}
		
	}

}
