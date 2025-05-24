package Multithreading1;

import java.time.LocalTime;
import java.util.concurrent.locks.ReentrantLock;

class CommonResource2 {
  public void hello(ReentrantLock lo) {
    System.out.println(LocalTime.now() + Thread.currentThread().getName() + " trying to acquire lock...");
    lo.lock();
    try {
      System.out.println(LocalTime.now() + ">>> Lock Acquired by " + Thread.currentThread().getName());
      Thread.sleep(3000);
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      lo.unlock();
      System.out.println(LocalTime.now() + "<<< Lock Released by " + Thread.currentThread().getName());
    }
  }
}

public class ReetrantLock {
  public static void main(String[] args) {
    ReentrantLock re = new ReentrantLock();
    CommonResource2 cr = new CommonResource2();
    Thread t1 = new Thread(() -> cr.hello(re));
    Thread t2 = new Thread(() -> cr.hello(re));
    t1.start();
    t2.start();
  }
}
