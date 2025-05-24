package Multithreading1;

import java.time.LocalTime;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class SharedMemor {
  public void readoperation(ReadWriteLock re) {
    try {
      System.out.println(LocalTime.now() + "Keeping Read Lock on " + Thread.currentThread().getName());
      re.readLock().lock();
      Thread.sleep(8000);
    } catch (Exception E) {

    } finally {
      re.readLock().unlock();
      System.out.println(LocalTime.now() + "Releasing  Read Lock on " + Thread.currentThread().getName());
    }
  }

  public void Writeoperation(ReadWriteLock re) {
    try {
      System.out.println(LocalTime.now() + "Keeping Write Lock on " + Thread.currentThread().getName());
      re.writeLock().lock();
      System.out.println(LocalTime.now() + "Keeping Write Locked on " + Thread.currentThread().getName());
    } catch (Exception E) {

    } finally {
      re.writeLock().unlock();
      System.out.println(LocalTime.now() + "Releasing Write Lock on " + Thread.currentThread().getName());
    }
  }
}

public class ReadWriteLockCustomLock {
  public static void main(String[] args) {
    SharedMemor sm = new SharedMemor();
    ReadWriteLock rw = new ReentrantReadWriteLock();
    Thread t1 = new Thread(() -> sm.readoperation(rw));
    Thread t2 = new Thread(() -> sm.readoperation(rw));
    Thread t3 = new Thread(() -> sm.Writeoperation(rw));
    t1.start();
    t2.start();
    t3.start();
  }
}
