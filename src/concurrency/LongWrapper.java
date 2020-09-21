package concurrency;

public class LongWrapper {

  private Long l;
  // Obj holding key for synchronization
  private Object key = new Object();

  public LongWrapper(Long l) {
    this.l = l;
  }

  public Long getLongVal() {
    return l;
  }

  public void incrementLongVal() {
    // synchronize - ensures scheduler waits for thread to complete
    synchronized (key) {
      l = l + 1;
    }
  }
}
