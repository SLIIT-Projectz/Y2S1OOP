package Question3;

public class Pattern01 extends Thread {
	private Object lock;
	private String pattern;
	private int count;
	
	public Pattern01(Object lock, String pattern, int count) {
		this.lock = lock;
		this.pattern = pattern;
		this.count = count;
	}
	
	public void run() {
		synchronized(lock) {
			for(int i = 0; i <= count; i++) {
				
				for (int j = 0; j < count - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print(pattern + " ");
                }
                
				System.out.println();
				try {
					Thread.sleep(1000);
					lock.notify();
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
