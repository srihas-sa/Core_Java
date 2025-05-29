package Multithreading1;

import java.util.concurrent.locks.StampedLock;

class SharedMemortampedLock {
  StampedLock lock = new StampedLock();
  int a = 12;

  public void produce() {
    long stamp = lock.tryOptimisticRead();
    try {
      if (lock.validate(stamp)) {
        System.out.println("Val of a inside produce is " + a);
        a = 13;
        Thread.sleep(6000);
      } else {
        System.out.println("Cannot update");
      }
    } catch (Exception e) {

    }
  }

  public void consumer() {
    long stamp = lock.writeLock();
    try {
      System.out.println("inside Consumer lock");
      a = 9;

    } catch (Exception e) {

    } finally {
      lock.unlockWrite(stamp);
    }

  }

}

public class StampedLock1 {
  public static void main(String[] args) {
    SharedMemortampedLock so = new SharedMemortampedLock();
    Thread t1 = new Thread(() -> so.produce());
    Thread t2 = new Thread(() -> so.consumer());
    t1.start();
    t2.start();
  }
}
