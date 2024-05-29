package Question3;

import java.util.ArrayList;

public class ThreadTest {

	public static void main(String[] args) {
		Object lock = new Object();
		// TODO Auto-generated method stub
		ArrayList<Integer> queue = new ArrayList<>();
		Thread producer = new Thread(new ProducerThread(queue, lock));
		Thread consumer = new Thread(new ConsumerThread(queue, lock));
		producer.start();
		consumer.start();
		System.out.println("Starting");
	}

}
