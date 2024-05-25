package Question3;

public class Pattern02 extends Thread{
	private Object lock;
	private String pattern;
	private int count;
	
	public Pattern02(Object lock, String pattern, int count) {
		this.lock = lock;
		this.pattern = pattern;
		this.count = count;
	}
	
	public void run() {
		synchronized(lock) {
			for(int i = 0; i < count; i++) {
				System.out.println("working thread 2 : " + i);
				
				try {
					Thread.sleep(1000);
//					if(i==10) {
//						lock.notify();
//					}
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
