package Question3;

public class EvenOddPrinter {
	public static final int MAX_NUM = 20;
	public static volatile int nextNum = 1;
	public static final Object lock = new Object();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread evenThread = new Thread(new EvenRunnable(), "EvenThread");
		Thread oddThread = new Thread(new OddRunnable(), "OddThread");
		
		oddThread.start();
		evenThread.start();
		
		try {
			oddThread.join();
			evenThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		you can comment the previous object creation and uncomment the below ... so you can check how
//		this question can be done in external file
//		Thread evenThreadOut = new Thread(new EvenRunnableOut(lock, MAX_NUM, nextNum), "EvenThread");
//		Thread oddThreadOut = new Thread(new OddRunnableOut(lock, MAX_NUM, nextNum), "OddThread");
//		
//		oddThreadOut.start();
//		evenThreadOut.start();
//		
//		try {
//			oddThreadOut.join();
//			evenThreadOut.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	static class EvenRunnable implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (lock) {
				while(MAX_NUM >= nextNum) {
					if(nextNum%2 == 0) {
						System.out.println(Thread.currentThread().getName() + ": " + nextNum);
					}
					
					nextNum++;
					
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
	
	static class OddRunnable implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (lock) {
				while(MAX_NUM >= nextNum) {
					if(nextNum%2 != 0) {
						System.out.println(Thread.currentThread().getName() + ": " + nextNum);
					}
					
					nextNum++;
					
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

}
