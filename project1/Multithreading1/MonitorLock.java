package Multithreading1;

class monitorlockmech {

  public synchronized void task1() {
    System.out.println("Before Locking task1");
    try {
      Thread.sleep(10000);
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public synchronized void task2() {
    System.out.println("Before Locking task2");
    try {
      Thread.sleep(10000);
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public void task3() {
    System.out.println("No Sncronized so print anwaeven though same obj is called");
  }

}

class runnableObj implements Runnable {

  monitorlockmech Commonobj;

  runnableObj(monitorlockmech Commonobj) {
    this.Commonobj = Commonobj;
  }

  public void run() {
    System.out.println();
    System.out.println(Thread.currentThread().getName());
  }
}

public class MonitorLock {
  public static void main(String[] args) {
    monitorlockmech Commonobj = new monitorlockmech();
    runnableObj runn = new runnableObj(Commonobj);
    Thread obj1 = new Thread(runn);
    Thread obj2 = new Thread(runn);
    Thread obj3 = new Thread(runn);
    obj1.start();
    obj2.start();
    obj3.start();

  }
}
