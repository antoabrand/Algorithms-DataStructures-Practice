package concurrency;

public class RaceConditions {

  public static void main(String[] args) throws InterruptedException {

    LongWrapper lw = new LongWrapper(0L);

    Runnable r = () -> {
      // increment longWrapper
      for (int i = 0; i < 1000; i++) {
        lw.incrementLongVal();
      }
    };
    Thread[] threads = new Thread[1000];
    for (int i = 0; i < threads.length; i++) {
      threads[i] = new Thread(r);
      threads[i].start();
    }
    for (int i = 0; i < threads.length; i++) {
      threads[i].join();
    }
    System.out.println(lw.getLongVal());
  }
}
