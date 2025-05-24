package Multithreading1;

import java.lang.reflect.Array;
import java.sql.Time;
import java.util.*;
import java.lang.Thread;

class ProduConsum {
  Queue<Integer> arr = new PriorityQueue<Integer>();

  public synchronized void producer() {
    if (arr.size() > 3) {
      try {
        Thread.sleep(1000);
        wait();
        notifyAll();
      } catch (Exception e) {
        System.out.println(e);
      }
    } else {

    }
    System.out.println("Schronized Producer is running");
    notifyAll();
  }

  public synchronized void Consumer() {
    while (!arr.isEmpty()) {
      try {
        System.out.println(arr.poll());
      } catch (Exception e) {
        System.out.println(e);
      }
    }
    System.out.println("Schronized Consumer is running");
  }
}

class producerRunnable1 implements Runnable {
  ProduConsum pro;

  producerRunnable1(ProduConsum pro) {
    this.pro = pro;
  }

  @Override
  public void run() {
    pro.producer();
    System.out.println("Producer thread   is Called");
  }
}

class ConsumerRunnable1 implements Runnable {
  ProduConsum Con;

  ConsumerRunnable1(ProduConsum Con) {
    this.Con = Con;
  }

  @Override
  public void run() {
    Con.Consumer();
    System.out.println("Consumer thread   is Called");
  }
}

public class ProducerConsumer {
  public static void main(String[] args) {

    ProduConsum sh = new ProduConsum();
    producerRunnable1 pr = new producerRunnable1(sh);
    ConsumerRunnable1 co = new ConsumerRunnable1(sh);
    Thread prothread1 = new Thread(pr);
    Thread Conthread2 = new Thread(co);
    prothread1.start();
    Conthread2.start();
  }

}
