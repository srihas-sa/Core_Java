package Atomicit;

import java.util.concurrent.atomic.AtomicInteger;

class SharedMemorforAomicit {
  int val;
  AtomicInteger co = new AtomicInteger(0);

  synchronized public void update() {
    // System.out.println(val);
    val++;
  }

  public void updateAtomicval() {
    co.getAndIncrement();
  }

  public void get() {
    System.out.println(this.val);
  }
}

public class Atomicit {
  public static void main(String[] args) {
    SharedMemorforAomicit sma = new SharedMemorforAomicit();
    Thread th1 = new Thread(() -> {
      for (int i = 1; i < 200; i++) {
        sma.update();
        sma.updateAtomicval();
      }
    });
    Thread th2 = new Thread(() -> {
      for (int i = 1; i < 200; i++) {
        sma.update();
        sma.updateAtomicval();
      }
    });
    th1.start();
    th2.start();
    try {
      th1.join();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    try {
      th2.join();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    sma.get();
    System.out.println(sma.co);
  }
}
