package concurrency;

public class Concurrency {

	public static void main(String[] args) {

		Runnable runnable = () -> {
			System.out.println("Current thread you are running on is: " + Thread.currentThread().getName());
		};

		Thread t1 = new Thread(runnable);
		t1.setName("My thread");
		t1.start();
		
		//will run thread and display the main thread and not My Thread
		t1.run();
	}

}
