package Question3;

import java.util.ArrayList;

public class ConsumerThread implements Runnable {
	private Object lock;
	private ArrayList<Integer> queue;

	public ConsumerThread(ArrayList<Integer> queue, Object lock) {
		// TODO Auto-generated constructor stub
		this.queue = queue;
		this.lock = lock;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			synchronized (lock) {				
				System.out.println("Consumer started");
				int value = this.queue.get(0);
				//method 2
				// int value = this.queue.remove(0);
				// this gets the first value and adds the value to the variable value nad removes it from the list
				System.out.println("Consumer thread consumes = " + value);
				
				//if you wish to use method 2 you should remove the below line as we have removed already ...
				this.queue.remove(Integer.valueOf(value));
				System.out.println("Elements in Queue = " + this.queue);
				
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
