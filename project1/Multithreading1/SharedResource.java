package Multithreading1;

class sharedres {
  boolean isAvailable = false;

  public synchronized void producer() {
    isAvailable = true;
    System.out.println("Schronized Producer is running");
    notifyAll();
  }

  public synchronized void Consumer() {
    while (!isAvailable) {
      try {
        wait();
      } catch (Exception e) {
        System.out.println(e);
      }
    }
    System.out.println(isAvailable);
    System.out.println("Schronized Consumer is running");
    isAvailable = false;
  }
}

class producerRunnable implements Runnable {
  sharedres pro;

  producerRunnable(sharedres pro) {
    this.pro = pro;
  }

  @Override
  public void run() {
    pro.producer();
    System.out.println("Producer thread   is Called");
  }
}

class ConsumerRunnable implements Runnable {
  sharedres Con;

  ConsumerRunnable(sharedres Con) {
    this.Con = Con;
  }

  @Override
  public void run() {
    Con.Consumer();
    System.out.println("Consumer thread   is Called");
  }
}

public class SharedResource {
  public static void main(String[] args) {
    sharedres sh = new sharedres();
    producerRunnable pr = new producerRunnable(sh);
    ConsumerRunnable co = new ConsumerRunnable(sh);
    Thread prothread = new Thread(pr);
    Thread Conthread = new Thread(co);
    prothread.start();
    Conthread.start();

  }
}
