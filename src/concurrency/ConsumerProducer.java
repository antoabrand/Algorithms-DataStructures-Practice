package concurrency;

public class ConsumerProducer {

	private static Object lock = new Object();
	private static int [] buffer;
	private static int count;

	static class Producer {

		void produce() {
			if (isFull(buffer)) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			buffer[count++] = 1;
			notify();

		}
	}

	static class Consumer {

		void consume() {
			if (isEmpty(buffer)) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			buffer[--count] = 0;
			notify();
		}
	}

	public static boolean isEmpty(int[] buffer) {
		return count == 0;
	}

	public static boolean isFull(int[] buffer) {
		return count == buffer.length;
	}

	public static void main(String... args) throws InterruptedException {

		count = 0;
		buffer = new int[10];

		Producer producer = new Producer();
		Consumer consumer = new Consumer();

		Runnable produceTask = () -> {
			for (int i = 0; i < 50; i++) {
				producer.produce();
			}
			System.out.println("Done producing :) ");
		};

		Runnable consumeTask = () -> {
			for (int i = 0; i < 50; i++) {
				consumer.consume();
			}
			System.out.println("Done consuming :) ");
		};

		Thread producerThread = new Thread(produceTask);
		Thread consumerThread = new Thread(consumeTask);

		producerThread.start();
		consumerThread.start();
		
		producerThread.join();
		consumerThread.join();
		
		System.out.println("Count is at: " + count);

	}

}
