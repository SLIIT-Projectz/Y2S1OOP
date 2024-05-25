package Question3;

public class EvenRunnableOut implements Runnable {
	public static Object lock;
	public static int MAX_NUM = 20;
	public static int nextNum = 1;
	
	public EvenRunnableOut(Object lock, int MAX_NUM, int nextNum) {
		this.lock = lock;
		this.MAX_NUM = MAX_NUM;
		this.nextNum = nextNum;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (lock) {
			for(int i = nextNum; i<MAX_NUM; i++) {
				if(i%2 == 0) {
					System.out.println(Thread.currentThread().getName() + ": " + i);
				}
				
				try {
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
